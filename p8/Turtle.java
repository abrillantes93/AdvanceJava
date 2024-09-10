// Anthony Brillantes
// COP 2805C – 91339
// 07/19/2024
// P8 
package p8;
//Turtle:blastoise:4:blue:male:land:false -- example data structure

public class Turtle extends Pet implements WalkMyPet{
    //class fields - habitat, requires heat
    private String habitat;
    private boolean reqHeat;

    public Turtle()
    {

    }

    public Turtle(String name, String color, String gender, int age, String habitat, boolean reqHeat)
    {
        super(name, age, color, gender);
        this.habitat = habitat;
        this.reqHeat = reqHeat;
    }

    public String getHabitat(){
        return this.habitat;
    }

    public boolean getReqHeat(){
        return this.reqHeat;
    }

    @Override
    public String walk(String walkLocation){
        //Pet fields
        String petMsg = "This pet is a turtle. " + "Its name is " + this.getName() + ". It is " + this.getAge() + " years old, " + 
            this.getColor() + ", " + this.getGender() + ". ";
        //Habitat and heat selections
        String msg1 = "It is going for a walk in the " + walkLocation;
    
        if (this.habitat == "water"){
        msg1 =  "It is going for a swim in the " + 
        walkLocation;
        } 

        String msg2 = ". It does not require heat.";
        if (reqHeat) {
            msg2 = ". It requires heat. ";
        }
        return petMsg + msg1 + msg2;
    }
}
