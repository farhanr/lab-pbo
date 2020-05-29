public class Anggota {
    private String nama, nim, jKelamin;

    public Anggota(String nama, String nim, String jKelamin) {
        this.nama = nama;
        this.nim = nim;
        this.jKelamin = jKelamin;
    }

    public String getNama() {
        return nama;
    }

    
    public String getNim() {
        return nim;
    }
    
    public String getjKelamin() {
        return jKelamin;
    }

    public String getData() {
        return "\tNama\t\t: " + nama + "\n" +
               "\tNIM\t\t\t: " + nim + "\n" +
               "\tJenis Kelamin\t: " + jKelamin + "\n";
    }

    @Override
    public String toString() {
        return nama;
    }
}