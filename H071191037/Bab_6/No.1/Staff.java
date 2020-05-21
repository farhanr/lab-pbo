
public class Staff extends Pegawai{
    private int jumlahKehadiran = 0;

    @Override
    public int getGaji() {
        return (jumlahKehadiran * 50000) + super.gaji;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public void setKehadiran(int value){
        jumlahKehadiran = value;
    }
}