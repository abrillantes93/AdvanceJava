
public class Fan {
    public static final int _SLOW = 1;
    public static final int _MEDIUM = 2;
    public static final int _FAST = 3;
    public static final int _MAX = 10;

    private int _speed = _SLOW;
    private boolean _on = false;
    private double _radius = 5;
    private String _color = "blue";
    private String _name = "Fan";

    //default constructor
    public Fan(){}

    public Fan(String name, String color){
        _name = name;
        _color = color;
    }

    public int GetSpeed(){
        return _speed;
    }
    public void SetSpeed(int speed){
        _speed = speed;
    }

    public void SetSpeedDouble() {
        int newSpeed = this._speed * 2;
        _speed = newSpeed >= _MAX ? _MAX : newSpeed;
        //put error handling checks
        // if (_speed > _MAX){
        //     _speed = _MAX;
        // }
    }
    public boolean GetON(){
        return _on;
    }
    public void SetON(boolean on){
        _on = on;
    }
    public double GetRadius(){
        return _radius;
    }
    public void SetRadius(double radius){
        _radius = radius;
    }
    public String GetColor(){
        return _color;
    }
    public void SetColor(String color){
        _color = color;
    }
  
    public String toString(){
        String message= "";
        if (_on){
             message += "on, fan speed: " + _speed + ", color: " + _color + ", has radius of: " + _radius;
        }
        else{message += "off, color: " + _color + " ,has radius of: " + _radius;
        }
        return message;
    }

    public void PrintStatus() {
        System.out.println(this._name + " " + this.toString());
    }
}