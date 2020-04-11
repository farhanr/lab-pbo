class Frog
{
    private String color;
    private int jump;

    Frog(String color, int jump)
    {
        this.color = color;
        this.jump = jump;
    }

    boolean compare(Frog frog)
    {
        return jump > frog.jump ? true:false;
    }

    static int getMax(Frog frogs[])
    {
        int max = frogs[0].jump;

        for(int i = 1; i < frogs.length; i++)
        {
            max = frogs[i].jump > max ? frogs[i].jump:max;
        }

        return max;
    }

    boolean getRun(Field field)
    {
        if(field != null)
        {
            return true;
        }
        return false;
    }

    void getProcess(Field field)
    {
        if(getRun(field))
        {
            int pijakan = 0;
            for(int i = 0; i < field.getTinggiBambu().length; i++)
            {
                if(jump - (field.getTinggiBambu(i) - pijakan) > 0)
                {
                    System.out.println("katak berwarna " + color + " berhasil melompati bambu ke-" + (i+1));
                }
                else
                {   
                    System.out.println("katak berwarna " + color + " gagal melompati bambu ke-" + (i+1));
                    break;
                }
            }
        }
        else
        {
            System.out.println("field tidak ada");
        }
    }


}