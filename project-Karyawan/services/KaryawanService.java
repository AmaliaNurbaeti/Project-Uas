package services;

import java.util.*;
import entity.*;

public class KaryawanService {

    private static List<DataKaryawan> data = new LinkedList<DataKaryawan>();

    public void tambahData(DataKaryawan Kar) {
        data.add(Kar);
        System.out.println("data telah tersimpan");
    }

    public void ubahData(DataKaryawan Kar) {
        int idx = data.indexOf(Kar);
        if(idx >= 0)
            data.set(idx, Kar);
            System.out.println("data telah berubah");

    }

    public void hapusData(String getid) {
        int idx = data.indexOf(new DataKaryawan(getid, "", ""));
        if(idx >= 0) {
            data.remove(idx);
            System.out.println("data telah terhapus");
        }
    }

    public void tampilkanData() {
        System.out.println("\n--= Data Karyawan =--");
        int urutan = 1;
        for (DataKaryawan Kar : data){
            System.out.println("data ke-" + urutan++);
            System.out.println("  NO KARYAWAN    : " + Kar.getid());
            System.out.println("  NAMA           : " + Kar.getNama());
            System.out.println("  JABATAN        : " + Kar.getjabatan());
        }
    }

}