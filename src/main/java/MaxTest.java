public class MaxTest {
    public int findMaxNumber(Integer one, Integer two, Integer three) {
        Integer maxNumber = one;
        if (two.compareTo(maxNumber) > 0) {
            maxNumber = two;
        }
        if (three.compareTo(maxNumber) > 0) {
            maxNumber = three;
        }
        return maxNumber;
    }
}