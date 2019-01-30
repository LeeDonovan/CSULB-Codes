import java.util.*;
class P{
    public void m1()
    {
        System.out.println("I'm a parent!");
    }
}
class C extends P{
    public void m2()
    {
        System.out.println("I'm a child!");
    }
}

public class inhert{
    public static void main(String[] args)
    {
        P p = new P();
        p.m1();
        //p.m2(); this does not work 

        C c = new C();
        c.m1();
        c.m2();

        P p1 = new C();
        p1.m1();
        //p1.m2(); this does not work
    }
}