package entity;

public class DataKaryawan {

    private String Nokaryawan;
    private String Nama;
    private String Jabatan;

    public DataKaryawan(String Nokaryawan, String Nama, String Jabatan){
        this.Nokaryawan = Nokaryawan;
        this.Nama = Nama;
        this.Jabatan = Jabatan;
    }

    public boolean equals(Object object) {
        DataKaryawan Kar = (DataKaryawan) object;
        return Nokaryawan.equals(Kar.getid());
    }

    public String getid() {

        return Nokaryawan;
    }

    public void setId(String Nokaryawan) {
        this.Nokaryawan = Nokaryawan;
    }

    public String getNama() {

        return Nama;
    }

    public void setNama(String nama) {

        this.Nama = nama;
    }

    public String getjabatan() {

        return Jabatan;
    }

    public void setjabatan(String jabatan) {

        this.Jabatan = jabatan;
    }
}