import java.util.ArrayList;

public class DataBase {
    ArrayList<Grup> listGrup = new ArrayList<>();

    public DataBase() {
        for (int i = 0; i < 4; i++) {
            listGrup.add(new Grup(String.format("Grup %d", i + 1)));
        }
    }

    public ArrayList<Grup> getListGrup() {
        return listGrup;
    }

    public Grup getGrup(String nGrup) {
        String[] str = nGrup.split(" ");
        return listGrup.get(Integer.parseInt(str[1]) - 1);
    }
}