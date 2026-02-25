package kalkulator;
import java.util.Scanner;
public class duaAngka{
    public static void proses(int n,char p,int m){
        int hasil;
        if(p=='+'){
            hasil = n+m;
            System.out.println("Hasil: "+hasil);
        }else if(p=='-'){
            hasil = n-m;
             System.out.println("Hasil: "+hasil);
        } else if(p=='*'){
            hasil = n*m;
             System.out.println("Hasil: "+hasil);
        } else if(p=='/'){
            if(m!=0){
                hasil = n/m;
                System.out.println("Hasil: "+hasil);
            }else{
                System.out.println("tidak bisa dibagi nol");
            }
        }else{
             System.out.println("tidak tersedia");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int n = sc.nextInt();
        System.out.print("proses(+,-,*,/): ");
        char p = sc.next().charAt(0);
        System.out.print("Masukkan angka kedua: ");
        int m = sc.nextInt();
        proses(n,p,m);
    }
}