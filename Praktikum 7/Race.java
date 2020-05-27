import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Race {
    public boolean isStarted = false;
    public int time;
    public int runners;
    public List<String> rankings = Collections.synchronizedList(new ArrayList<String>());

    public void start() {
        if (runners >= 3) {
            System.out.println("The race starts . . .");
            time = runners*1000;
            isStarted = true;
        } else {
            System.out.println("Not enough runners, the race can't be started");
        }
    }

    public void result() {
        while (true) {
            if (rankings.size() == runners){
                System.out.println("The race is over\n");
                int count = 0;
                String[] placement = {"1st","2nd","3rd"};
                for (String rankings : rankings) {
                    if (count < 3) {
                        System.out.printf("%s : %s\n",placement[count], rankings);
                    } else {
                        System.out.printf("%s Lost\n",rankings);
                    }
                    if (count ==2) {
                        System.out.println();
                    }
                    count++;
                }
                return;
            }

        }

    }

}