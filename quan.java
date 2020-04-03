class quan {
    public static void main(String[] args)
    {
        int a[] = {8,4,5,3,7,6};
        int i = 0;
        boolean found = false;
        int numOfElements = 6;
        while(!found && i < numOfElements)
        {
            if(a[i] == 4)
            {
                found = true;
                System.out.println("a = " + a[i]);
                for(int j = i; j< numOfElements - 1; ++j)
                {
                    a[j] = a[j + 1];
                    System.out.println("a[j] = " + a[j]);
                    --numOfElements;
                    System.out.println("numofElements = " + numOfElements);
                }
            }
            else{
                
                ++i;
                System.out.println("++i" + i);
            }
        }
        for(int j = 0; j< 6; i++)
            System.out.print(a[j] + " ");
        
    }
}