package Hesaplamalar;

import java.util.Scanner;

public class TekSayi {
    public static void main(String[] args) {

        int n;
        int total=0;//eger burada totale 0 degerini girmezsek not initialezed hatasi aliriz

        Scanner input=new Scanner(System.in);

        do {
            System.out.print("Sayi Giriniz :");
            n=input.nextInt();
            if ((n%2==0) || (n%4==0)){
                total+=n;
            }
        }while (!(n%2==1));
        System.out.println("Toplam :"+ total);
    }
}
