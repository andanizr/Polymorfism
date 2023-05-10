public class Pegawai {
    
    private String nama;
    private String noKTP;

    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama(){
        return nama;
    }
    
    public String getNoKTP(){
        return noKTP;
    }

    public String toString(){
        System.out.println(" Nama \t: " + nama);
        System.out.println("noKTP \t: " + noKTP);
        return "Data Informasi \n Nama\t\t: " + nama + "\n NoKTP\t\t: " + noKTP;
    }

    public double gaji(){
        return gaji();
    }
}
