// Anthony Brillantes
// COP 2805C – 91339
// 07/19/2024
// P8 
package p8;
//example data structure - bird:Bessie:3:green:female:pidgeon:yes:10
public class Bird extends Pet implements WalkMyPet{
    //class fields - Species,can talk, flightAlltiude
    private String birdSpecies;
    private int flightAlltiude;
    private boolean booleanCanTalk = false;

    public Bird(){

    }
    
    public Bird(String name, String color, String gender, int age,String birdSpecies, String canTalk, int flightAlltiude) throws PetException
    {
        super(name, age, color,gender);
        this.birdSpecies = birdSpecies;
        setCanTalk(canTalk);
        this.flightAlltiude = flightAlltiude;
    }

    public void setCanTalk(String canTalk){
     
        if (canTalk.equals("yes")){
            booleanCanTalk = true;
        } else {
            booleanCanTalk = false;
        }
    }
    public String getBirdSpecies(){
        return this.birdSpecies;
    }


    public int getFlightAlltiude(){
        return this.flightAlltiude;
    }

    @Override
    public String walk(String walkLocation){
        //Pet fields
        String petMsg = "This pet is a bird. Its name is " + this.getName() + ". It is " + this.getAge() + " years old, " + 
        this.getColor() + ",  " + this.getGender() + ". It is a " + this.birdSpecies + ". ";
        //Bird Specific fields
        String msg1 = this.getName() + " is flying " + this.getFlightAlltiude() + " feet high in the " + 
        walkLocation;
        //Talking selection
        String msg2 = ". It cannot talk. ";
        if (booleanCanTalk){
            msg2 = ". It is talking. ";
        } 
        return petMsg + msg1 + msg2;
    }
}
