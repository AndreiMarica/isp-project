package domain.util;

public enum IntensitateSimptom {
    slab("slab"),
    mediu("mediu"),
    puternic("puternic")
    ;

    private final String text;

    /**
     * @param text
     */
    private IntensitateSimptom(final String text) {
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
