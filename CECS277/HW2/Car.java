class Car{
    
    int size;

    public Car() 
    {
      size = 0;  
    }
    
    public Car(int s)
    {
        size = s;
    }

    public int setCar(int s)
    {
        this.size = s;
        return size;
    }

    public int getCar(int s)
    {
        
        if (s == 1)
        {
            size = 20;
        }
        if (s == 2)
        {
            size = 35;
        }
        if (s == 3)
        {
            size = 50;
        }
        return size;
    }

    public int getSize()
    {
        return size;
    }

    public String typeCar(int x)
    {
        if (x == 1)
        {
            return "Economy";
        }
        if (x == 2)
        {
            return "Medium";
        }
        if (x == 3)
        {
            return "Full-Size";
        }
        return null;
    }
}



