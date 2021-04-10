package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double bayarSPP = 1000000;
        double saldoTabungan = 1200000;

        if (saldoTabungan<bayarSPP){
            System.out.println("Uang Masih Kurang, Tunggu Uang Kaget!!");
        }else if (saldoTabungan>bayarSPP){
            double kembalian = saldoTabungan-bayarSPP;
            System.out.println("Uang Cukup, Alhamdulillah, Lunas!! Ada Kembalian : "+kembalian);
        }else{
            System.out.println("Uang Pas..pas..an");
        }
    }
}
