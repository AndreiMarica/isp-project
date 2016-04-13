package domain.util;

public enum TipInformatii {
    grasimi("grasimi"),
    proteine("proteine"),
    carbohidrati("carbohidrati"),
    fibre("fibre"),
    kcal("kcal")
    ;

    private final String text;

    /**
     * @param text
     */
    private TipInformatii(final String text) {
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
