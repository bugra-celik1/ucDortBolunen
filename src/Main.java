
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int sayi;

        double b=0,c=0,avarage;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        sayi = inp.nextInt();

        for(int i =0;i<=sayi;i++){
            if( i % 3 == 0 && i % 4 == 0){
                b += i;
                c++;

            }
        }
        avarage = b / c;

        System.out.println("3'e ve 4'e bölünen sayıların ortalaması:" + avarage);


    }
}