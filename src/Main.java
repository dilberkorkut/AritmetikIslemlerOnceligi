import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanicinin girdigi sayilar a,b,c olsun.
        System.out.print("1.sayiyi giriniz: ");
        int a = input.nextInt();

        System.out.print("2.sayiyi giriniz: ");
        int b = input.nextInt();

        System.out.print("3.sayiyi giriniz: ");
        int c = input.nextInt();

        // islem sonucu hesaplama
        int result = a + b * c - b;
        System.out.println("Sonuc: " +result);

    }
}