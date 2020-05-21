
public class Dosen extends Pegawai{
    private int jumlahSks = 0;

    @Override
    public int getGaji() {
        return (jumlahSks*120000) + super.gaji;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public void setSks(int value){
        jumlahSks = value;
    }
}