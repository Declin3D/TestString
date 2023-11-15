import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst");
        String t1 = scanner.nextLine();
        String dwieOstatnie;
        String reszta;

        if(t1.length() >= 3){
            dwieOstatnie = t1.substring(t1.length()-2,t1.length());
            reszta = t1.substring(0,t1.length()-2);
            System.out.println("Zamieniony tekst : " + dwieOstatnie + reszta);
        }else {
            System.out.println("Nie udało się - tekst '" + t1 + "' jest za krótki");
        }

    }
}
