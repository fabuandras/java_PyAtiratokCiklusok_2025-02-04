package pyatiratok;

import java.util.Scanner;

public class Szamjegyek {
    
    static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("_i_smétléssel v. _n_élküle? (i/n): ");
        String tipus = scn.nextLine();
        System.out.print("2,3,4 jegyekből a számok");
        boolean ism;
        if (tipus.equals("i")) {
            ism = true;
            System.out.println(" ismétléssel");
        } else {
            ism = false;
            System.out.println(" ismétlés nélkül");
        }
        scn.close();
    }
}
