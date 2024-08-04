package collection.compare.test;

public enum CardShape {
    SPADE("\u2660"), HEART("\u2665"), DIAMOND("\u2666"),CLUB("\u2663");

    private String icon;

    CardShape(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
