import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) 
    {
        //Array (Dizi) Nedir?
        // Aynı türden birden fazla veriyi tek bir değişkende tutmamızı sağlar.
        int[] notlar = new int[];
        notlar[0] = 76;
        notlar[1] = 81;
        System.out.println(notlar[1]);

        int[] numbers = {5,2,4,54,6,7};
        System.out.println(numbers[3]);

        System.out.println(Arrays.toString(numbers));
    }
}
