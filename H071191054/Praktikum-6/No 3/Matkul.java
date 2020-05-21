public abstract class Matkul {
    static private String[] listMatkul = { "Pemrograman Berorientasi Objek", "Bahasa Inggris", "Matematika Dasar II",
            "Wawasan IPTEKS", "Kewarganegaraan", "Aljabar Linear", "Metode Statistika", "Logika Komputer",
            "Technopreneurship" };

    static public void showListMatkul() {
        for (String s : listMatkul)
            System.out.println("-> " + s);
    }

    public abstract String getNama();

    public abstract String getDosen();

    public abstract int getSks();
}