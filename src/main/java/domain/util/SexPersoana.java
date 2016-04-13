package domain.util;

public enum SexPersoana {
    M("M"),
    F("F")
    ;

    private final String text;

    /**
     * @param text
     */
    private SexPersoana(final String text) {
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
