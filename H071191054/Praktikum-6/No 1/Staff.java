public class Staff extends Pegawai {
    int bonus = 50000;
    int presence;

    public Staff(String name, int presence) {
        super(name);
        this.presence = presence;
    }

    public void totalSalary(String name, int presence) {
        int total = firstSalary + (presence * bonus);
        System.out.println(name + " mendapatkan gaji Rp. " + total);
    }
}