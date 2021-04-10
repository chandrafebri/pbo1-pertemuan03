package percabangan;

public class Switch {
    public static void main(String[] args) {
//        int jalanJalan=10;
//        switch (jalanJalan){
//            case 1 :
//                System.out.println("urang lapas");
//                break;
//            case 2 :
//                System.out.println("urang acayan");
//                break;
//            case 3 :
//                System.out.println("ubat nyamuk");
//                break;
//            case 4 :
//                System.out.println("dubil dit");
//                break;
//            default:
//                System.out.println("makhluk halus");
//                break;
//        }
        char nilai = 'B';
        switch (nilai){
            case 'A':
                System.out.println("Mhs   : \"Terima Kasih Atas Bimbingannya selama ini, Pak\"");
                System.out.println("Dosen : \"Sama-sama, Selamat ya, Semoga Bermanfaat Ilmunya\"");
                break;
            case 'B' :
                System.out.println("Mhs   : \"Sedikit Lagi saya bisa dapat A, Pak\"");
                System.out.println("Dosen : \"Yasudah, mengulang di semester depan ya.\"");
                break;
            case 'C' :
                System.out.println("Mhs   : \"Alhamdulillah Selamet\"");
                System.out.println("Dosen : \"Generasi Pas..pas..an.\"");
                break;
            default:
                System.out.println("Mhs   : \"(Nangis).. Otak Saya udah ga kuat buat kuliah, Pak.\"");
                System.out.println("Dosen : \"Tetap Semangat, Nak. Setelah ini Kerja saja dulu, baru Kuliah Lagi.\"");
                break;
        }
    }
}
