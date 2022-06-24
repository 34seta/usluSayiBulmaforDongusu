import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n; // üssü alinacak sayi
        int k; // üs sayisi
        System.out.print("n Ussu alinacak sayiyi giriniz : ");
        n = input.nextInt();
        System.out.print("k Us olacak sayiyi giriniz : ");
        k = input.nextInt();
        int i = 1;
        int total = 1;

      /*  while (i <= k) {
            System.out.println(n);
            i++;
            total=total*n;
        } System.out.println("while dongusu ile uslu sayi hesaplama: "+total);*/
 // for döngüsü kullanılarak üslü sayi hesabı:

        for(i=1; i<=k; i++){

            total= total*n;
        }System.out.println("for dongusu ile uslu sayi hesaplama = "+total);
    }

}