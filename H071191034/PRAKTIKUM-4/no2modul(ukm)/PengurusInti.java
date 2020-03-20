class PengurusInti extends Anggota {
    public PengurusInti (String nama, String nim, String email, String prodi){
        super (nama, nim, email, prodi);
    }
    
    String ketua, sekertaris, bendahara;
    public String ketua() {
        String ketua = "Ketua UKM";
        return ketua;
    }

    public String sekertaris(){
        String sekertaris = "Sekertaris UKM";
        return sekertaris;
    }

    public String bendahara(){
        String bendahara = "Bendahara UKM";
        return bendahara;
    }

    @Override
    public void showData(){
        System.out.println();
        System.out.println("========================================");
        System.out.println("Nama\t: "+nama);
        System.out.println("NIM\t: "+nim);
        System.out.println("E-mail\t: "+email);
        System.out.println("Prodi\t: "+prodi);
        // System.out.println("========================================");
        // System.out.println("Jabatan\t: "+jabatan);
    }
    
}