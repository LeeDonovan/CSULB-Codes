
interface Top{
    int x = 10;
}

interface Down{
    int x = 32;
}

class Interface implements Top, Down{
    public static void main (String[] args)
    {
        int x = 3;
        System.out.println(Top.x);
        System.out.println(Down.x);
        System.out.println(x);
    }
}