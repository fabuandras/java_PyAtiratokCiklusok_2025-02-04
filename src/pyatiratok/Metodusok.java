package pyatiratok;

public class Metodusok {
    
    public static void main(String[] args) {
        f1_elso10SzamOsszege();
        f2_KettoSzamOsszegeKiirva();
        f3_HaromSzamOsszegenekGyokeKiirva();
        f4_NegySzamOsszegeKiirva();
    }
    
    static void kiirKonzolra(String szoveg){
        
    }
    
    static int osszead(int a, int b){
        return 0;
    }
    
    static int f1_elso10SzamOsszege(){
        int osszeg = 0;
        for (int i = 0; i < 11; i++) {
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
        kiirKonzolra(f"{a}+{b}+{c} gyöke az ");
        c = c + osszead(a,b)
        gyok = math.sqrt(c)
        kiirKonzolra(str(round(gyok, 4)) + "\n");
    }
    
    static void f4_NegySzamOsszegeKiirva(){
        int a = 3;
        int b = 4;
        int c = 7;
        int d = -1;
        kiirKonzolra(a + "+" + b + "+" + c + "+(" + d + ")=" + osszead(osszead(a, b), osszead(c, d)) + "\n");
    }
    
}
