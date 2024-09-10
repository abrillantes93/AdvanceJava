// Anthony Brillantes
// COP 2805C – 91339
// 07/19/2024
// P8 
package p8;
//example data structure for dog -- Dog:jerome:2:brown:male:mutt:waggy:slobbery:true
public class Dog extends Pet implements WalkMyPet{ //is a dog, implements WalkMyPet()
    private String breed;

    private String slobber;
    private boolean canCatchBall = false;
    private boolean booleanWaggy = false;
    private boolean booleanSlobber = false;

    public Dog(){

    }

    public Dog(String name, String color, String gender, int age ,String breed, String tailWag, String slobber, boolean canCatchBall){
        super(name,  age,  color, gender);
        this.breed = breed;
    
        setBooleanSlobber(slobber);
        setBooleanWaggy(tailWag);
        this.canCatchBall = canCatchBall;
    }

    public void setBooleanWaggy(String tailWag){
        if (tailWag.equals("waggy")){
            this.booleanWaggy = true;
        } 
    }   

    public void setBooleanSlobber(String slobber){
        if (slobber.equals("slobbery")){
            this.booleanSlobber = true;
        }
    }

    // public void setBooleanSlobber()

    public String getBreed(){
        return this.breed;
    }

    public boolean getTailWag(){
        return this.booleanWaggy;
    }

    public String getSlobber(){
        return this.slobber;
    }

    public boolean getCanCatchBall(){
        return this.canCatchBall;
    }

    @Override
    public String walk(String walkLocation){
        //pet fields 
        String petMsg = "This pet is a dog. " + "Its name is " + this.getName() + ". It is " + this.getAge() + " years old, " + 
            this.getColor() + ", "+ this.getGender() + ". ";
        //Dog specific fields 
        String msg1 =  this.getName() + " is a " + this.getBreed() + ". ";

        String msg2 = this.getName() + " is walking in the " + walkLocation + ". "; 
        //Boolean selection
        String msg3 = " Its mouth is dry. ", msg4 = "Its tail is still. ", msg5 = " It cannot catch a ball.";
        if (booleanSlobber){
            msg3 = " Its mouth has slobber. ";
        }  
        if (booleanWaggy){
            msg4 = " Its tail is waggy. ";
        }
        if(canCatchBall){
            msg5 = " It can catch a ball.";
        }
        return petMsg + msg1 + msg2 + msg3 + msg4 + msg5;

    }
}
