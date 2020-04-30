package UoM;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class JTest {

    @Test
    public void addAnswer() {
        JenkinsTest func = new JenkinsTest();
        assertEquals(2, func.add(1));
    }

    @Test
    public void multiplyAnswer() {
        JenkinsTest func = new JenkinsTest();
        assertEquals(4, func.multiply(2));
    }

    @Test
    public void subtractAnswer() {
        JenkinsTest func = new JenkinsTest();
        assertEquals(0, func.subtract(3));
    }

    @Test
    public void divideAnswer() {
        JenkinsTest func = new JenkinsTest();
        assertEquals(1, func.divide(4));
    }


}

