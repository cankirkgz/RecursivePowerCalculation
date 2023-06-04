import java.util.Scanner;

public class Main {
    static int power(int base, int exponent) {
        if (exponent == 0)
            return 1;
        else
            return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base, exponent;

        System.out.print("Taban değerini giriniz: ");
        base = scan.nextInt();

        System.out.print("Üs değerini giriniz: ");
        exponent = scan.nextInt();

        int result = power(base, exponent);
        System.out.println("Sonuç: " + result);
    }
}
