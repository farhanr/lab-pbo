import java.util.ArrayList;

public class Grup {
    private String nGrup;
    private ArrayList<Anggota> angGrup = new ArrayList<>();

    public Grup(String nGrup) {
        this.nGrup = nGrup;        
    }

    public void addAggota(String nama, String nim, String jKelamin) {
        angGrup.add(new Anggota(nama, nim, jKelamin));
    }

    public Anggota getAnggota(int index) {
        return angGrup.get(index);
    }

    public ArrayList<Anggota> getAngGrup() {
        return angGrup;
    }

    @Override
    public String toString() {
        return nGrup;
    }
}