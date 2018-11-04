
package feladat_11;

import java.util.Scanner;


public class Feladat_11 {

   
    public static void main(String[] args) {
       int szam=0;
       int oszzes =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Kérjünk be egy N pozitív egész számot: ");
        szam= input.nextInt();
        for (int i = 0; i < szam; i++) {
            if(i % 2 == 1){
            oszzes+=i;
            }else{
                
            }
        }
        System.out.println("Öszeg: "+oszzes);
    }
    
}
