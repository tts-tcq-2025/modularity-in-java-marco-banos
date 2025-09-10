package colorcoder.model;

public class ColorPair {
    private MajorColor majorColor;
    private MinorColor minorColor;

    private final static String[] MajorColorNames = {
            "White", "Red", "Black", "Yellow", "Violet"
    };
    private final static String[] MinorColorNames = {
            "Blue", "Orange", "Green", "Brown", "Slate"
    };

    public ColorPair(MajorColor major, MinorColor minor) {
        this.majorColor = major;
        this.minorColor = minor;
    }

    public MajorColor getMajor() {
        return majorColor;
    }

    public MinorColor getMinor() {
        return minorColor;
    }

    @Override
    public String toString() {
        return MajorColorNames[majorColor.getIndex()] + " " +
                MinorColorNames[minorColor.getIndex()];
    }
}
