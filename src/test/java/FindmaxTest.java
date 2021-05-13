import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class FindMaxTest {
    MaxTest findMax = new MaxTest();
    @Test
    void ifNumberOneIsMaxReturnTrue() {
        Assertions.assertEquals(88, findMax.findMaxNumber(10,6,88));
    }

    @Test
    void ifNumberTwoIsMaxReturnTrue() {
        Assertions.assertEquals(5, findMax.findMaxNumber(5, 3, 2));
    }

    @Test
    void ifNumberThreeIsMaxReturnTrue() {
        Assertions.assertEquals(22, findMax.findMaxNumber(1, 5, 22));
    }
}