class P{
    public void m1(int i)
    {
        System.out.println("parent");
    }
}
class C extends P
{
    public void m1(int x)
    {
        System.out.println("child");
    }
}
class Test{
    public static void main(String [] arg)
    {   
        P p = new P();
        p.m1(5);

        C c = new C();
        c.m1(10);

        P p1 = new C();
        p1.m1(23);
    }   
}