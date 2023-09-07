import java.util.Scanner;
import java.util.SortedMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner = null;
        int number = scanner1.nextInt();

        for (int i = 1; i <= number; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
        System.out.printf("");
        int skladnik1 = 15;
        int skladnik2 = 9;


        scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita");
        skladnik2 = scanner.nextInt();
        System.out.println(skladnik1 + skladnik2);


    }

}