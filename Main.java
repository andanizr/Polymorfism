public class Main {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai("Andani Zahira", "225150607111025");
        System.out.println(pegawai.toString());

        pegawai = new PegawaiHarian("Danish Satrio", "215150607111011", 75.000, 7);
        System.out.println(pegawai.toString());

        pegawai = new PegawaiTetap("M. Raynaldo Fitra Pratama", "225150607111019", 2.000000);
        System.out.println(pegawai.toString());

        pegawai = new Sales("Moch Zoel", "225150607111027", 10, 50.000);
        System.out.println(pegawai.toString());
    }
}
