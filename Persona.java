public class Persona{
    private String name;
    private String lastName;
    private int age;
    
    public Persona(){
        this.name = "";
        this.lastName = "";
        this.age = 1;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}
