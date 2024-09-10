
import java.util.*;

//object Class - Cars
public class Cars{
    //properties of class 
    //not variables not inside of a method - 'scope'
    //can instiate without Constructor - properties will have default values
    /*
     * string = null
     * int = 0
     * booelean = false
     * double = 0.0
     * char c = n\0000000
     */
    private String _make;
    private String _model;
    private String _trim;
    /** 
     *  default constructor with no parameters
    */
    public Cars() {

    }
    //pass parameters thru  - constructor, institate object
    /**
     * Overloaded Constructor
     * @param make
     * @param model
     * @param trim
     */
    public Cars(String make, String model, String trim) {
        _make = make;
        _model = model;
        _trim = trim;
    }
    //getters - public vs private methods - allows outside methods to access local values
    /**
     * Get Make of Car
     * @return
     */
    public String GetMake(){
        return _make;
    }
    public String GetModel(){
        return _model;
    }
    public String GetTrim(){
        return _trim;
    }

    //setters - allow outside methods to asign value 
    /**
     * Set make of Car
     * @param make
     */
    public void SetMake(String make){
        _make = make;
    }

    public void SetModel(String model){
        _model = model;
    }

    public void SetTrim(String trim){
        _trim = trim;
    }

}