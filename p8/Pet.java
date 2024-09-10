// Anthony Brillantes
// COP 2805C – 91339
// 07/19/2024
// P8 
package p8;

public class Pet{
    //Parent class - fields : name, color, age, gender
    protected String name; 
    protected String color;
    protected int age;
    protected String gender;

    public Pet(){ //default constructor
    }

    public Pet(String name,  int age, String color,String gender){//constructor with arguments
        this.name = name;
        this.color = color;
        this.age = age;
        this.gender = gender;       
    }
    
    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

    public int getAge(){
        return this.age;
    }

    public String getGender(){
        return this.gender;
    }
}
