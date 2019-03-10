package romancalculator;

/**
 * Data type for conversion result. 
 * Holds source value (as string) and the conversion result
 */
public class ConversionResult {
    private final String result;
    private final String source;

    /**
     * Constructor
     * @param source Source value as string
     * @param result conversion result as string
     */
    public ConversionResult(String source, String result) {
        this.source = source;
        this.result = result;
    }

    /**
     * @return the source value as string
     */
    public String getSource() {
        return source;
    }

    /**
     * @return the conversion result as string
     */
    public String getResult() {
        return result;
    }
}
