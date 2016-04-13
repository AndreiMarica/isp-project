package domain.util;

public enum TipMasa {

    mic_dejun("mic_dejun"),
    pranz("pranz"),
    cina("cina")
    ;

    private final String text;

    /**
     * @param text
     */
    private TipMasa(final String text) {
        this.text = text;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return text;
    }
}
