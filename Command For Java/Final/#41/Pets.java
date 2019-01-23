
class Pets implements Comparable<Pets>{
    String name;
    int age;
    String type; 

    public Pets(String inname,int inage, String intype) {
        name=inname;
        age=inage;
        type=intype;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String toString() {
        return "Pets [name=" + name + ", age=" + age + ", type=" + type + "]";
    }
    }