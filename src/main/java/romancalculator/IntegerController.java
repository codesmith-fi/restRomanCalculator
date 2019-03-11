package romancalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import romannumerals.RomanNumeralParser;

/**
 * Controller for handling requests to /api/integer 
 * Converts an integer into Roman numeral
 */
@RestController
@RequestMapping("/api")
public class IntegerController {
    /** 
     * Class constants
     */
    private static final String TEXT_UNDEFINED = "undefined";
    
    /**
     * Handles get request /integer
     * e.g. http://localhost:8080/api/integer
     * @return ConversionResult holding the result and the source value as "undefined"
     */
    @GetMapping("/integer")
    public ConversionResult integer() {
        return new ConversionResult(TEXT_UNDEFINED, TEXT_UNDEFINED);
    }

    /**
     * Handles get request /integer/[valueasInt]
     * e.g. http://localhost:8080/api/integer/14
     * @return new ConversionResult holding the source value and result
     */
    @GetMapping("/integer/{value}")
    public ConversionResult integer(@PathVariable int value) {
        String result = RomanNumeralParser.parseInt(value);
        return new ConversionResult(Integer.toString(value), result);
    }
}
