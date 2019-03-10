package romancalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import romannumerals.RomanNumeralParser;

/**
 * Controller for handling requests to /integer 
 * Converts an integer into Roman numeral
 */
@RestController
@RequestMapping("/integer")
public class IntegerController {
    /**
     * Handles get request /integer?value=[valueasInt]
     * e.g. http://localhost:8080/integer?value=14
     * @return new ConversionResult holding the source value and result
     */
    @RequestMapping
    public ConversionResult integer(@RequestParam(value="value", defaultValue="") Integer value) {
        String result = RomanNumeralParser.parseInt(value);
        return new ConversionResult(Integer.toString(value), result);
    }
}
