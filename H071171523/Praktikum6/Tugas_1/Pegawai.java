package Tugas_1;

class Pegawai {
    public String name;
    public int gaji=2500000;
    
    public Pegawai(String name){
        setName(name);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getGaji() {
        return gaji;
    }
}