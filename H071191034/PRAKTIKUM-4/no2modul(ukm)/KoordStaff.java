class KoordStaff extends Anggota {
    public KoordStaff (String nama, String nim, String email, String prodi){
        super (nama, nim, email, prodi);
    }
    
    String  humas, saPrasarana, konsul;
    public String humas(){
        return "Koordinator Humas";
    }

    public String saPrasarana(){
        String saPrasarana = "Koordinator Sarana-Prasarana";
        return saPrasarana;
    }

    public String konsul(){
        String konsul = "Koordinator Konsul";
        return konsul;
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
        // System.out.println();
    }
    
}