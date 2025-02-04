package pyatiratok;

import java.util.Random;

public class Ciklusok {
    //           típus  név          metótus
    static final Random random = new Random();
    
    public static void main(String[] args) {
        System.out.println("1. feladat: ");
        System.out.println("\tAz első 10 +páros szám összege: ");
        int osszeg = 0;
        int db = 0;
        int szam = 0;
        while (db < 10){
            System.out.print(szam + ", ");
            osszeg += szam;
            szam += 2;
            db += 1;
        }
        System.out.println("\nÖsszesen: " + osszeg);
        
        
        
        System.out.println("\n2. feladat: ");
        System.out.println("10..15 közötti számok, kivéve 13: ");
        int n = random.nextInt(10, 16); //10..15
        while (n != 13){
            System.out.print(n + " ");
            n = random.nextInt(10, 16); //10..15
        }
        System.out.println("\n");
        
        
        
        System.out.println("3. feladat: ");
        System.out.println("Egyjegyű számok (while): ");
        int i = 0;
        while (i < 10){
            System.out.print(i + " ");
            i++; //i += 1;
        }
        System.out.println("\n");
        
        
        
        System.out.println("5. feladat: ");
        System.out.println("Egyjegyű számok (for): ");
        for (int k = 0; k < 10; k++){
            System.out.print(k + " ");
        }
        System.out.println("\n");
                
                
        
        System.out.println("4. feladat: ");
        System.out.println("Egyjegyű számok (for): ");
        for (int j = 0; j < 10; j++){
            System.out.print(j + " ");
        }
        System.out.println("\n");
        
        
        
        System.out.println("6. feladat: ");
        System.out.println("Páratlan egyjegyű számok: ");
        for (int m = 1; m < 10; m += 2){
            System.out.print(m + " ");
        }
        System.out.println("\n");
        
        
        
        System.out.println("7. feladat: ");
        System.out.println("3 - -3-ig abs értékben: ");
        for (int o = 3; o >= -3; o--){
            System.out.println("|{i:2}| = {abs(i)}");
        }
    
    
    }//main
    
}//class
