
public class TreeTester{
    public static void main(String [] args)
    {
        Tree a = new Tree("a");
        Tree b = new Tree("b");
        Tree c = new Tree("c");
        Tree d = new Tree("d");
        Tree e = new Tree("e");
        Tree f = new Tree("f");
        Tree g = new Tree("g");

        a.addSubtree(b);
        a.addSubtree(c);
        b.addSubtree(d);
        b.addSubtree(e);
        c.addSubtree(f);
        c.addSubtree(g);

        System.out.println(a);
        
        
    }
}