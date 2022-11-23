import Infrastructure.City;
import citizens.Citizen;
import citizens.Tubik;

public class Main {
    public static void main(String[] args){
        Citizen tubik = new Tubik(55, new City());
        tubik.work();
    }
}
