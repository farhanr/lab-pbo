public class Persegi extends BangunDatar {
    private double sisi;
    
    public Persegi(double sisi){
        this.sisi = sisi;
    }

    @Override
    public double keliling(){
        double keliling = 4*sisi;
        return keliling;
    }
    public double luas(){
        double luas = Math.pow(sisi, 2);
        return luas;
    }
}
//ad a pertanyaan? but materi ini?
// tidak adaji kak cuma panjang sekali di class Mainnya
// iyo memang panjang, nda perlu ji sebenranya kerja semuanya
//cuma mau dikasih liat konsep inheritance yang pake extends extends itu

// yang pernting mengerti itunya
// iya mengerti jka kak tentang extends
// biar cuma kubus persegi ko kerja kukasih benarji
