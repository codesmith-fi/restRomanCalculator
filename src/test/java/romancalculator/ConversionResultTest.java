package romancalculator;

import org.junit.*;
import static org.junit.Assert.*;

public class ConversionResultTest {
    @Test
    public void testConversionResultHasSourceValue() {
        ConversionResult result = new ConversionResult("sourceValue", "resultValue");
        assertTrue(result.getSource().equals("sourceValue"));
    }

    @Test
    public void testConversionResultHasResultValue() {
        ConversionResult result = new ConversionResult("sourceValue", "resultValue");
        assertTrue(result.getResult().equals("resultValue"));
    }
}
