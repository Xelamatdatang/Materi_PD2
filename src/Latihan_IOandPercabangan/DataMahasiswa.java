package Latihan_IOandPercabangan;

//step 1 import library
import java.io.InputStreamReader;
//import java.io.IOException;
import java.io.BufferedReader;

public class DataMahasiswa {
    public static void main(String[] args)  {
        //step 3 deklarasi class BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //step 4 deklarasi variable
        String nim, nama, prodi;
        int sms, sksAmbil;
        //step 2 error handling = throws IOException
        //contoh error handling try catch
        try {
            //step 5 pengerjaan logika program
            System.out.println("----- Data Mahasiswa -----"); //header

            //input
            System.out.print("NIM : ");
            nim = br.readLine();
            System.out.print("Nama : ");
            nama = br.readLine();
            System.out.print("Prodi : ");
            prodi = br.readLine();
            System.out.print("Semester : ");
            sms = Integer.parseInt(br.readLine());
            System.out.print("Jumlah SKS yang diambil : ");
            sksAmbil = Integer.parseInt(br.readLine());

            //output
            System.out.println("NIM mahasiswa :" + nim);
            System.out.println("Nama mahasiswa :" + nama);
            System.out.println("Prodi mahasiswa :" + prodi);
            System.out.println("Semester mahasiswa :" + sms);
            System.out.println("Jumlah SKS mahasiswa :" + sksAmbil);

        } catch (Exception e) {
            //kondisi ketika ada error, apa yang ditampilkan
            System.out.println(e.getMessage());
            System.out.println("Isian semester dan sks harus angka!");
        }
    }
}
