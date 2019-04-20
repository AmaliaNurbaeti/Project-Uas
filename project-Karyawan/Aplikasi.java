import services.*;
import entity.*;
import java.util.*;

public class Aplikasi {

    private static KaryawanService service;
    private static Scanner scanner;

    public static void main(String[] args) {
        service = new KaryawanService();
        scanner = new Scanner(System.in);

        int opsi = 5;
        do {
            tampilkanMenu();
            try {
                scanner = new Scanner(System.in);
                opsi = scanner.nextInt();
            } catch(InputMismatchException e) {
                System.err.println("Silahkan periksa input menunya");
                opsi = 0;
            } catch(NoSuchElementException e) {
                System.err.println("Inputnya exhausted");
                opsi = 0;
            } catch(IllegalStateException e) {
                System.err.println("Scanner ketutup");
                opsi = 0;
            }
            seleksi(opsi);
        } while(opsi != 5);
    }

    private static void seleksi(int opsi) {
        switch(opsi) {
            case 1:
                callFormTambahData();
                break;
            case 2:
                callFormUbahData();
                break;
            case 3:
                callFormHapusData();
                break;
            case 4:
                service.tampilkanData();
                break;
        }
    }

    private static void callFormHapusData() {
        scanner = new Scanner(System.in);

        System.out.print("ID KARYAWAN    : ");
        String Nokaryawan = scanner.nextLine();
        service.hapusData(Nokaryawan);
    }

    private static void callFormUbahData() {
        scanner = new Scanner(System.in);
        String Nokaryawan, Nama, Jabatan;

        System.out.println("\n-= Form Ubah Data =-");
        System.out.print("ID KARYAWAN    : ");
        Nokaryawan = scanner.nextLine();
        System.out.print("NAMA           : ");
        Nama = scanner.nextLine();
        System.out.print("JABATAN        : ");
        Jabatan = scanner.nextLine();
        service.ubahData(new DataKaryawan(Nokaryawan, Nama, Jabatan));
    }

    private static void callFormTambahData() {
        scanner = new Scanner(System.in);
        String Nokaryawan, Nama, Jabatan;



        System.out.println("\n-= Form Tambah Data =-");
        System.out.print("ID KARYAWAN    : ");
        Nokaryawan = scanner.nextLine();
        System.out.print("NAMA           : ");
        Nama = scanner.nextLine();
        System.out.print("JABATAN        : ");
        Jabatan = scanner.nextLine();
        service.tambahData(new DataKaryawan(Nokaryawan, Nama, Jabatan));
    }

    private static void tampilkanMenu() {
        System.out.println("    |# | Aplikasi DATA KARYAWAN  |");
        System.out.println("    _____________________________");
        System.out.println("    |1.| TAMBAH DATA KARYAWAN  |");
        System.out.println("    |2.| UBAH DATA KARYAWAN    |");
        System.out.println("    |3.| HAPUS DATA            |");
        System.out.println("    |4.| MENAMPILKAN DATA      |");
        System.out.println("    |5.| KELUAR                |");
        System.out.println("    =============================");
        System.out.print  ("opsi > ");
    }

}