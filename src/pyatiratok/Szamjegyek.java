package pyatiratok;

import java.util.Scanner;

public class Szamjegyek {
    
    static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("_i_smétléssel v. _n_élküle? (i/n): ");
        boolean ism = scn.nextLine() == "i";
        System.out.print("2,3,4 jegyekből a számok");
        String ki = ism ? " ismétléssel " : " nem ismétléssel ";
        System.out.println(ki);
        scn.close();
    }
}
