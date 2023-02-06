import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {

        //Değişkenlerin tanımlanması işlemi.

        int yil;
        double artikyil;

        //Yıl bilgisinin girilmesi işlemi.

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl bilgisini giriniz: ");
        yil = input.nextInt();

        //Artık yıl hesaplama ve sonucun yazılması işlemi.

        if (yil % 100 != 0) {
            if (yil % 4 == 0) {
                System.out.print("Artık bir yıldır.");
            }
            else {
                System.out.println("Artık bir yıl degildir.");
            }
        }
        else {
            if (yil % 400 == 0) {
                System.out.print("Artık bir yıldır.");
            }
            else {
                System.out.print("Artık bir yıl degildir.");
            }
        }
    }
}
