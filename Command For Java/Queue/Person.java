public class Person{
    private String F,L;
    public Person(String First,String Last){
        this.F = First;
        this.L = Last;
    }
    public String getName(){
        return (F+" "+L);
    }

}