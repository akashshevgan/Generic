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

    @Test
    void ifFloatNumberOneIsMaxReturnTrue() {
        Assertions.assertEquals(10.0, findMax.findFloatMaxNumber(10.0F, 5.0F, 2.5F));
    }

    @Test
    void ifFloatNumberTwoIsMaxReturnTrue() {
        Assertions.assertEquals(10.0, findMax.findFloatMaxNumber(5.0F, 10.0F, 2.5F));
    }

    @Test
    void ifFloatNumberThreeIsMaxReturnTrue() {
        Assertions.assertEquals(10.0, findMax.findFloatMaxNumber(2.5F, 5.0F, 10.0F));
    }
    @Test
    void ifStringOneIsMaxReturnTrue() {
        Assertions.assertEquals("b", findMax.findStringMaxNumber("b", "a", "p"));
    }

    @Test
    void ifStringTwoIsMaxReturnTrue() {
        Assertions.assertEquals("b", findMax.findStringMaxNumber("a", "b", "p"));
    }

    @Test
    void ifStringThreeIsMaxReturnTrue() {
        Assertions.assertEquals("b", findMax.findStringMaxNumber("p", "a", "b"));
    }
}



