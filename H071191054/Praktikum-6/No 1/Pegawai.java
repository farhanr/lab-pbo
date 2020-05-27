public class Pegawai {
    String name;
    int firstSalary = 2500000;

    public Pegawai(String name) {
        this.name = name;
    }

    public void totalSalary(String name) {
        System.out.println(name + "mendapatkan gaji Rp. " + firstSalary);
    }
}