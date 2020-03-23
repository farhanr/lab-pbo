import java.util.Random;
// import java.util.Scanner;

class Main
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        int tinggiBambu[] = new int[10];
        String colors[] = {"merah", "hijau", "kuning", "biru", "oranye", "coklat", "toska", "emas", "perak"
                           , "hitam"};

        for(int i = 0; i < 10; i++)
        {
            tinggiBambu[i] = rand.nextInt(10)+1;
        }

        Field field = new Field(tinggiBambu);
        Frog frogs[] = new Frog[10];

        for(int i = 0; i < 10; i++)
        {
            
            frogs[i] = new Frog(colors[i], rand.nextInt(11)+1);
        }

        System.out.println("loncatan tertinggi kodok " + Frog.getMax(frogs));

        for(int i = 0; i < 10; i++)
        {
            frogs[i].getProcess(field);
        }



    }
}