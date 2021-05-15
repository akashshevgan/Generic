public class MaxTest {
    public <E extends Comparable<E>> E findMax(E firstValue, E secondValue, E thirdValue) {
        E maxValue = firstValue;
        if (secondValue.compareTo(maxValue) > 0) {
            maxValue = secondValue;
        }
        if (thirdValue.compareTo(maxValue) > 0) {
            maxValue = thirdValue;
        }
        return maxValue;
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