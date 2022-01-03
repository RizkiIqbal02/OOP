package OOP;

//public class Main {
//    public static void main(String[] args) {
////        Kendaraan kendaraan1 = new Kendaraan();
////        kendaraan1.getJenisKendaraan();
////        System.out.println(kendaraan1.getJenisKendaraan());
////
////
////        Kendaraan jenisKendaraan = new Kendaraan();
////        jenisKendaraan.setJenisKendaraan("Mobil");
////        System.out.println(jenisKendaraan.getJenisKendaraan());
////
////        Kendaraan jenisKendaraan2 = new Kendaraan();
////        jenisKendaraan2.setJenisKendaraan("Truk");
////        System.out.println(jenisKendaraan2.getJenisKendaraan());
//
//
//
//
////        Kendaraan motor = new Kendaraan();
//////        motor.setWarna();
////        System.out.println(motor.getWarna());
//
////        NamaHewan hewan1 = new NamaHewan();
////        NamaHewan hewan2 = new NamaHewan();
////        NamaHewan hewan3 = new NamaHewan();
////        hewan1.namaHewan = "singa";
////        hewan2.namaHewan = "Kuda";
////        System.out.println(hewan2.namaHewan);
////        System.out.println(hewan1.namaHewan);
////
////
////        NamaHewan buntut = new NamaHewan();
////        buntut.ekor = "9";
//
//
////        NamaSiswa siswa1 = new NamaSiswa();
////        siswa1.nama = "Ucup";
////        siswa1.kelas = "9 G";
////        siswa1.umur = 47;
////        System.out.println(siswa1.nama);
////        System.out.println(siswa1.kelas);
////        System.out.println(siswa1.umur);
////
////        NamaSiswa siswa2 = new NamaSiswa();
////        siswa2.nama = "Juned!";
////        siswa2.kelas = "8 G";
////        siswa2.umur = 60;
////        System.out.println(siswa2.nama);
////        System.out.println(siswa2.kelas);
////        System.out.println(siswa2.umur);
//
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        printArea();
//
//    }
//
//    //complete the method
//    public static void printArea() {
//        Scanner read = new Scanner(System.in);
//        int width = read.nextInt();
//        int height = read.nextInt();
//        System.out.println(width*height);
//    }
//}
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        getAverageScore();
//    }
//    //create your method here
//    public static double getAverageScore() {
//        Scanner read = new Scanner(System.in);
//        double score1 = read.nextDouble();
//        double score2 = read.nextDouble();
//        double score3 = read.nextDouble();
//        double score4 = read.nextDouble();
//        double jumlah = score1 + score2 + score3 + score4;
//        double avgScore = jumlah / 4;
//        System.out.println(avgScore);
//        return avgScore;
//    }
//}
//// 3 + 3 x 5 = 18

public class Main {
    public static void main(String[] args) {

        //create a Loading object with the same name


        Loading loading = new Loading();
        loading.LoadingMessage();
    }
}

class Loading {
    //complete the class, add LoadingMessage() method
    public void LoadingMessage() {
        System.out.println("Loading");
    }
}