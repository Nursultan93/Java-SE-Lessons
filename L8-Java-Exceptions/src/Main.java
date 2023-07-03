import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Ilk reqemi daxil edin: ");

            int a = sc.nextInt();

            System.out.println();
            System.out.print("İkinci reqemi daxil edin: ");

            int b = sc.nextInt();

            System.out.println();
            System.out.print("Adiniz daxil edin*:");

            String name = sc.next();

            if (b == 0 || name == null){
                throw new RuntimeException("ad null ola bilmez ve b 0 ola bilmez");
            }

            int c = a/b;

            System.out.println("Netice: "+c);
        }catch (ArithmeticException e) {
            System.out.println("Riyazi sehv emeliyat bas verdi");
        }finally {
            System.out.println("Bura finally blokurdur");
        }

    }
}