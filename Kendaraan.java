package OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class Kendaraan {
    private String warna = "hijau";
    private String jenisKendaraan = "Motor";




    public String getJenisKendaraan(){
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenis){
        this.jenisKendaraan = jenis;
    }


//    public String getWarna(){
//        return warna;
//    }
//
//    public void setWarna(){
//        String w;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Masukkan warna : ");
//        w = sc.nextLine();
//        this.warna = w;
//    }
}
