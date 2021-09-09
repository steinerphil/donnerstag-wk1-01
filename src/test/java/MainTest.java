import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void check30(){
        //GIVEN
        int numOfPersons = 30;

        //CHECK
        boolean numberFits = Main.checkPersons(numOfPersons);  //true when number fits / false when persons > 30
        //EXP.
        Assertions.assertTrue(numberFits);
    }

    @Test
    void checkTooHigh(){
        //GIVEN
        int numOfPersons = 31;

        //CHECK
        boolean numberFits = Main.checkPersons(numOfPersons);  //true when number fits / false when persons > 30
        //EXP.
        Assertions.assertFalse(numberFits);
    }

}
