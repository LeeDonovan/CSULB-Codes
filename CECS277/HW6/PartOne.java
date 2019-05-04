import java.io.*;
import java.util.*;

public class PartOne
{
    private Node root;

    public Tree(String readData)
    {
        root = new Node();
        root.data  = readData;
        root.lastDown = new ArrayList<Node>();
    }

    public static class Node
    {
        private String data;
        private String firstUp;
        private List<Node> lastDown;
    }
}