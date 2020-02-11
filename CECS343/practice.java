class practice{
    public static void main(String[] args) {
        int max = 100;
        for (int i = 0; i<max;i++)
        {
            if(i%15 == 0)
            {
                System.out.println("FizzBuzz ");
            }
            else if(i%3 == 0)
            {
                System.out.println("Fizz ");
            }
            else if(i%5 == 0)
            {
                System.out.println("Buzz  ");
            }
            
            else
            {
                System.out.println(i);
            }
        }
    }
}