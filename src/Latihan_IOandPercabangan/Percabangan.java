package Latihan_IOandPercabangan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Percabangan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //if-else
        //cek syarat pembuatan KTP
        int usia = 0;
        System.out.print("Masukkan usia anda: ");
        usia = Integer.parseInt(br.readLine());
        if (usia >= 17) {
            System.out.println("Anda sudah memenuhi syarat!");
        } else {
            System.out.println("Anda belum memenuhi syarat :(");
        }
        //if-else-if
        //cek status kelulusan MK
        String nim;
        int nilaiUAS;
        System.out.print("Masukkan NIM: ");
        nim = br.readLine();
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUAS = Integer.parseInt(br.readLine());

        //jika nilai 80,70,65 = lulus, di bawah 65 tidak lulus
        if (nim.equalsIgnoreCase("22410100053") && nilaiUAS == 80){
            System.out.println("LULUS!");
        } else if (nim.equalsIgnoreCase("22410100053") && nilaiUAS == 70){
            System.out.println("LULUS");
        }else if (nim.equalsIgnoreCase("22410100053") && nilaiUAS == 65){
            System.out.println("LULUS");
        }else if (nim.equalsIgnoreCase("22410100053") && nilaiUAS < 65){
            System.out.println("TIDAK LULUS");
        } else {
            System.out.println("Nilai tidak di temukan!");
        }

        //nested if
        //cek menu yang dipilih (makanan/minuman)
        //makanan = snack, nasi bungkus
        //minuman = teh, kopi, air, nutrisari

        String menu, jenis;
        System.out.print("Masukkan menu (makanan/minuman): ");
        menu = br.readLine();
        System.out.println("Masukkan jenis menu \n Makanan: Snack, Nasi bungkus \n Minuman: Kopi, Teh, Air, Nutrisari. Pilih: ");
        jenis = br.readLine();

        if (menu.equalsIgnoreCase("makanan")) {
            if (jenis.equalsIgnoreCase("snack")){
                System.out.println("Harga: Rp2.000,00");
            } else if (jenis.equalsIgnoreCase("nasi bungkus")){
                    System.out.println("Harga: RP7.000,00");

        } else if (menu.equalsIgnoreCase("minuman")){
            if (jenis.equalsIgnoreCase("Kopi")){
                System.out.println("Harga: RP3.000,00");
            } else if (jenis.equalsIgnoreCase("Teh")){
                    System.out.println("Harga: RP4.000,00");
                } else if (jenis.equalsIgnoreCase("air")){
                        System.out.println("Harga: RP2.000,00");
                    } else if (jenis.equalsIgnoreCase("nutrisari")){
                            System.out.println("Harga: RP4.500,00");
                }
            }
        }
    }
}