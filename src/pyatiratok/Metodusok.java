package pyatiratok;

public class Metodusok {
    
    public static void main(String[] args) {
        kiirKonzolra("********************************\nElső 10 N+ szám összege:");
        kiirKonzolra((f1_elso10SzamOsszege()) + "\n********************************");
        kiirKonzolra("\nnéhány szám összege, gyöke:\n");
        f2_KettoSzamOsszegeKiirva();
        f3_HaromSzamOsszegenekGyokeKiirva();
        f4_NegySzamOsszegeKiirva();
    }
    
    static void kiirKonzolra(String szoveg){
        System.out.print(szoveg);
    }
    
    static int osszead(int a, int b){
        return a + b;
    }
    
    public int kivon(int a, int b){
        System.out.println("Kivon: " + a-b);
    }
    
    static int f1_elso10SzamOsszege(){
        int osszeg = 0;
        for (int i = 0; i <= 10; i++) {
            osszeg += i;
        }
        return osszeg;
    }
    
    static void f2_KettoSzamOsszegeKiirva(){
        int a = 3;
        int b = 4;
        kiirKonzolra(a + "+" + b + "=" + osszead(a, b) + "\n");
    }
    
    static void f3_HaromSzamOsszegenekGyokeKiirva(){
        int a = 3;
        int b = 4;
        int c = 5;
        kiirKonzolra(a + "+" + b + "+" + c + " gyöke az ");
        c = c + osszead(a, b);
        double gyok = Math.sqrt(c);
        kiirKonzolra(String.format("%.4f", gyok) + "\n");
    }
    
    static void f4_NegySzamOsszegeKiirva(){
        int a = 3;
        int b = 4;
        int c = 7;
        int d = -1;
        kiirKonzolra(a + "+" + b + "+" + c + "+(" + d + ")=" + osszead(osszead(a, b), osszead(c, d)) + "\n");
    }
    
    void eljaras(){
        System.out.println("Ez egy eljárás, mondjuk beállít vmit.");
    }
    
    long dupla(int szam){
        return szam * 2;
    }
}
