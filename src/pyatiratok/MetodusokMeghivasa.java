package pyatiratok;

import java.util.Random;
import java.util.Scanner;

public class MetodusokMeghivasa {
    
    static final Random rnd = new Random();
    static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int a = rnd.nextInt();
        System.out.println("Kérek egy egész számot: ");
        int b = scn.nextInt();
        
        int e = Metodusok.osszead(a, b);
        System.out.println("e = " + e);
        
        Math.abs(a);
    }
}
