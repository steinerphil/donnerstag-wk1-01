public class Main {


    public static void main(String[] args) {

        int numberOfPersons = 31;
        checkPersons(numberOfPersons);
    }


public static void checkPersons(int count){
        if(count <= 30){
            System.out.println("Maximale Personenanzahl nicht überschritten.");
        }
        else{
            System.out.println("Maximale Personenanzahl überschritten.");
        }
}

}
