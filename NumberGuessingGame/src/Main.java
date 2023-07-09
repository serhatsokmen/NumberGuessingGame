import java.util.*;
public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(100);

        Scanner scan = new Scanner(System.in);
        //System.out.println(number);

        int right = 0;
        int selected;
        int[] wrongGuess = new int[6];
        boolean isWin = false;



        System.out.println(">>SAYI TAHMİN OYUNUNA HOŞ GELDİNİZ<<\nDOĞRU SAYIYI BULMAK İÇİN 5 HAKKINIZ VARDIR. BAŞARILAR DİLERİZ.");
        while (right <= 4) {


            System.out.print("sayı tahmiminiz : ");
            selected = scan.nextInt();

            if(selected < 0 || selected > 99) {
                System.out.println("0-100 arasında bir tahminde bulunmalısınız!");
                continue;
            }

            if(selected == number) {
                System.out.println("TEBRİKLER! Sayıyı doğru tahmin ettiniz!"+" ("+number+")");
                isWin = true;
                break;
            }
            else {
                right++;
                System.out.println("Tahmininiz yanlış! Tekrar deneyin!");
                if(selected > number) {
                    System.out.println("ipucu : yükseklerde uçuyorsunuz.");
                }
                else {
                    System.out.println("ipucu : alçaklarda uçuyorsunuz.");
                }
                wrongGuess[right] = selected;
                System.out.println("kalan hakkınız : "+ (5 - right));
            }



        }

        if(!isWin) {
            System.out.println("Maalesef doğru tahminde bulunamadınız ve oyunu kaybettiniz!");
            System.out.println("yaptığınız tahminler : "+Arrays.toString(wrongGuess));
            System.out.println("tahmin edilmesi gereken sayı : "+number+" olmalıydı.");
        }






    }
}