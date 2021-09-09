import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void check30AndPersonCountMax30(){
        //GIVEN
        int numOfPersons = 30;
        String alarmstufe = "gelb";
        //CHECK
        boolean numberFits = Main.checkPersons(numOfPersons, alarmstufe);  //true when number fits / false when persons > 30
        //EXP.
        Assertions.assertTrue(numberFits);
    }

    @Test
    void check31AndMaxPersonCount30(){
        //GIVEN
        int numOfPersons = 31;
        String alarmstufe = "gelb";
        //CHECK
        boolean numberFits = Main.checkPersons(numOfPersons, alarmstufe);  //true when number fits / false when persons > 30
        //EXP.
        Assertions.assertFalse(numberFits);
    }

    @Test
    void check0AndMaxPersonCount0(){
        //GIVEN
        int numOfPersons = 0;
        String alarmstufe = "rot";
        //CHECK
        boolean numberFits = Main.checkPersons(numOfPersons, alarmstufe);  //true when number fits / false when persons > 0
        //EXP.
        Assertions.assertTrue(numberFits);
    }



}
