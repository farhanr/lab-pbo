package Tugas_1;

class Staf extends Pegawai{
    int hadir;
    public Staf(String name, int hadir){
        super(name);
        setHadir(hadir);
    }
    public void setHadir(int hadir) {
        this.hadir = hadir;
    }
    public int getHadir() {
        return hadir;
    }
    @Override
    public int getGaji() {
        return gaji + (hadir * 50000);
    }
}