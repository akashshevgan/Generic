public class MaxTest {
    public int findMaxNumber(Integer one, Integer two, Integer three) {
        Integer maxNum = one;
        if (two.compareTo(maxNum) > 0) {
            maxNum = two;
        }
        if (three.compareTo(maxNum) > 0) {
            maxNum = three;
        }
        return maxNum;
    }

    public float findFloatMaxNumber(Float one, Float two, Float three) {
        Float maxNum = one;
        if (two.compareTo(maxNum) > 0) {
            maxNum = two;
        }
        if (three.compareTo(maxNum) > 0) {
            maxNum = three;
        }
        return maxNum;
    }

    public String findStringMaxNumber(String stringOne, String stringTwo, String stringThree) {
        String maxNum = stringOne;
        if (stringTwo.compareTo(maxNum) > 0) {
            maxNum = stringTwo;
        }
        if (stringThree.compareTo(maxNum) < 0) {
            maxNum = stringThree;
        }
        return maxNum;
    }
}