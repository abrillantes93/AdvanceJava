import java.util.Stack;

public class FanStore {
    // private Fan _fans[] = new Fan[10];
    private Stack <Fan>_fans = new Stack<Fan>(); 

    public int GetFans(){
        return _fans.size();
    }
    public FanStore(
    ){}

    /**
     * @param fan
     */
    public void AddFan(Fan fan) {
        _fans.push(fan);
    }

    // TODO implement remove fan

    public void PrintStore() {
        if (this._fans.size() > 0)
            System.out.println("Number of fans: " + this._fans.size());
        else System.out.println("Fan Store is empty");
    }

    public int GetBlueFans() {
        int blueFans = 0;
        for (int j = 0; j < _fans.size(); j++) {

            Fan currentFan = _fans.elementAt(j);

            // check if its blue
            if (currentFan.GetColor() == "blue"){
                // add to blue count 
                blueFans++; 
            }
            
            
        }
        
        return blueFans;
    }

    
}