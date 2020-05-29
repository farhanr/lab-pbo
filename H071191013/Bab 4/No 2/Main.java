import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{

        HashMap<String, String> faculty = new HashMap<>();
        HashMap<String, String> major = new HashMap<>();
        ArrayList<String> jabatan = new ArrayList<>(); 
        

        jabatan.add("Ketua");
        jabatan.add("Bendahara");
        jabatan.add("Sekretaris");
        jabatan.add("Pimpinan Staf");

        faculty.put("Teknik", "T");
        faculty.put("Farmasi", "F");
        faculty.put("MIPA", "H");

        major.put("Teknik Mesin", "05");
        major.put("Ilmu Komputer", "07");
        major.put("Farmasi", "06");

        PengurusInti pengurusInti1 = new PengurusInti("Rafli Fathur Rachman", 18, 2019, jabatan.get(0));
        PengurusInti pengurusInti2 = new PengurusInti("Luffy", 17, 2019, jabatan.get(2));

        //BIODATA PENGURUS INTI
        System.out.println("-------- PENGURUS INTI --------");
        pengurusInti1.setFaculty("MIPA");
        pengurusInti1.setMajor("Ilmu Komputer");
        pengurusInti1.setDate(22, 07, 2001);
        pengurusInti1.setNim(faculty, major);
        pengurusInti1.showInfo();
        
        pengurusInti2.setFaculty("Farmasi");
        pengurusInti2.setMajor("Farmasi");
        pengurusInti2.setDate(06, 04, 2003);
        pengurusInti2.setNim(faculty, major);
        pengurusInti2.showInfo();

        Staf staf = new Staf("Zoro", 18, 2019, jabatan.get(3));

        //BIODATA STAFF
        System.out.println("\n-------- BIODATA STAF --------");
        staf.setFaculty("Teknik");
        staf.setMajor("Teknik Mesin");
        staf.setDate(13, 02, 2001);
        staf.setNim(faculty, major);
        staf.showInfo();
        
    }
}