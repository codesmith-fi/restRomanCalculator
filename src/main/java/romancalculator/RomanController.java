package romancalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import romannumerals.RomanNumeralParser;

/**
 * Controller for handling requests to /roman 
 * Converts an Roman numeral into integer (as string)
 */
@RestController
public class RomanController {
    /** 
     * Class constants
     */
    private static final String TEXT_UNDEFINED = "undefined";

    /**
     * Handles get request /roman
     * e.g. http://localhost:8080/roman
     * @return ConversionResult holding the result and the source value as "undefined"
     */
    @GetMapping("/roman")
    public ConversionResult roman() {
        return new ConversionResult(TEXT_UNDEFINED, TEXT_UNDEFINED);
    }    

    /**
     * Handles get request /roman/[romanValue]
     * e.g. http://localhost:8080/roman/XIV
     * @return ConversionResult holding the result and the source value
     */
    @GetMapping("/roman/{value}")
    public ConversionResult roman(@PathVariable String value) {
        int result = RomanNumeralParser.parseRoman(value);
        return new ConversionResult(value, Integer.toString(result));
    }    
}
