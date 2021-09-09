public class Main {


    public static void main(String[] args) {

        int numberOfPersons = 0;
        String alarmstufe = "rot";
        checkPersons(numberOfPersons, alarmstufe);
    }


public static boolean checkPersons(int count, String alarmstufe){
        int maximumNumberOfPersons = 0;
        switch (alarmstufe){
            case "rot":
                maximumNumberOfPersons = 0;
                break;
            case "gelb":
                maximumNumberOfPersons = 30;
                break;
            case "grün":
                maximumNumberOfPersons = 60;
                break;
            default:
                System.out.println("Falsche Eingabe [Alarmstufe]");
                return false;
        }
        if(count <= maximumNumberOfPersons){
            System.out.println("Maximale Personenanzahl nicht überschritten.");
            return true;
        }
        else{
            System.out.println("Maximale Personenanzahl überschritten.");
            return false;
        }
}

}
