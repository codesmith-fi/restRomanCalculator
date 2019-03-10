package romancalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import romannumerals.RomanNumeralParser;

/**
 * Controller for handling requests to /roman 
 * Converts an Roman numeral into integer (as string)
 */
@RestController
@RequestMapping("/roman")
public class RomanController {
    /**
     * Handles get request /roman?value=[roman string]
     * e.g. http://localhost:8080/roman?value=XIV
     * @return ConversionResult holding the result and the source value
     */
    @RequestMapping
    public ConversionResult roman(@RequestParam(value="value", defaultValue="") String value) {
        int result = RomanNumeralParser.parseRoman(value);
        return new ConversionResult(value, Integer.toString(result));
    }    
}
