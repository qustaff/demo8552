import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        Product mleko = new Product( "Mlekovita" , 4.99 , "nabiał" , 7, 20);
        mleko.setName("Łaciate");
        mleko.setPrice(-5.75);
//      mleko.category = "nabiał";
//      mleko.amount = 5;

        Product cukier = new Product();

        System.out.println(mleko);
        System.out.println(mleko.countPriceVat());
        System.out.println(mleko.countValue());

        System.out.println();


    }


}