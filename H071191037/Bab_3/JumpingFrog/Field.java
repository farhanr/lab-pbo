class Field
{
    private int tinggiBambu[] = new int[10];

    Field(int arr[])
    {
        tinggiBambu = arr;
    }

    void setTinggiBambu(int indeks, int tinggi)
    {
        tinggiBambu[indeks] = tinggi;
    }

    int getTinggiBambu(int indeks)
    {
        return tinggiBambu[indeks];
    }

    int getMinTall()
    {
        int min = tinggiBambu[0];

        for(int i: tinggiBambu)
        {
            min = i < min ? i:min;
        }

        return min;
    }

    int[] getTinggiBambu()
    {
        return tinggiBambu;
    }
}