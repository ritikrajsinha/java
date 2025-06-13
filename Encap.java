class Human{
    private String name;
    private int age;


    public Human()
    {
        name="John wick";
        age=23;
    }
    //parametirzed constructor
    public Human(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    //set name
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}

public class Encap{
    //main
    public static void main(String[] args) {
        //create object
        Human obj = new Human("ritik",23);
        //set name
        // obj.setName("Ritik Sinha");
        // obj.setAge(24);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());

    }


}


