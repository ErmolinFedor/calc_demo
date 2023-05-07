package calc;

import demo.services.calc.Main;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class CalcTest {

    @DataProvider(name = "positive")
    public static Object[][] positive() {
        return new Object[][] {
                {"100500", "\"100\" + \"500\""},
                {"Hi ", "\"Hi World!\" - \"World!\""},
                {"Bye-bye!", "\"Bye-bye!\" - \"World!\""},
                {"JavaJavaJavaJavaJava", "\"Java\" * 5"},
                {"1234567890123456789012345678901234567890...", "\"1234567890\" * 5"},
                {"Exa", "\"Example!!!\" / 3"}};
    }

    @DataProvider(name = "negative")
    public static Object[][] negative() {
        return new Object[][] {
//                {"100500", "\"100\" + \"500\""},
//                {"Hi ", "\"Hi World!\" - \"World!\""},
//                {"Bye-bye!", "\"Bye-bye!\" - \"World!\""},
//                {"JavaJavaJavaJavaJava", "\"Java\" * 5"},
                {"number should be less 10", "\"Java\" * 11"},
                {"number should be whole", "\"Java\" * 2.5"},
                {"number should be whole", "\"Java\" * 2,5"},
                {"line should be less 10", "\"12345678901\" * 2"},
                {"First Line is Empty", "3 + \"hello\""},
                {"Second should be number", "\"Example!!!\" / \"hello\""}};
    }


    @Test(dataProvider = "positive")
    public void positive(String expected, String input) throws Exception {
        Main main = new Main();
        String res = main.service(input);
        assertEquals(expected , res);

    }

    @Test(dataProvider = "negative")
    public void negative(String expected, String input) throws Exception {
        Main main = new Main();

        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            String res = main.service(input);
        });

        Assertions.assertEquals(expected, thrown.getMessage());

    }
}
