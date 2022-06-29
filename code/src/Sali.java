import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sali {

    private static final List<String> people = List.of("Ali","Alim","Arda","Beytullah",
            "Burak Can","Dogus","Emre","Furkan","Huseyin","İbrahim","Kadir","Kubilay","Mehmet Mustafa",
            "Ömer Faruk","Şeyda","Tolga","Yigit");


    public static int random(){
        Random random = new Random();
        return random.nextInt(11);
    }
    public static void main(String[] args) {
        System.out.println("Secilen -> " + people.get(random()));
    }
}
