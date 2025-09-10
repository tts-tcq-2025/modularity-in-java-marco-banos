package colorcoder.test;

import colorcoder.model.*;
import colorcoder.service.ColorCoder;

public class ColorCoderTest {
    public static void testNumberToPair(int pairNumber,
                                        MajorColor expectedMajor,
                                        MinorColor expectedMinor) {
        ColorPair colorPair = ColorCoder.getColorFromPairNumber(pairNumber);
        System.out.println("Got pair " + colorPair.toString());
        assert colorPair.getMajor() == expectedMajor;
        assert colorPair.getMinor() == expectedMinor;
    }

    public static void testPairToNumber(MajorColor major,
                                        MinorColor minor,
                                        int expectedPairNumber) {
        int pairNumber = ColorCoder.getPairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert pairNumber == expectedPairNumber;
    }
}
