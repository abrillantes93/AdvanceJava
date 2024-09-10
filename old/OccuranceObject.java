import java.util.HashMap;

public class OccuranceObject {
  private HashMap<Integer, Integer> properties = new HashMap<Integer,Integer>();

  public OccuranceObject(){

  }
  public Object setProperty(int key, int value){
    if (this.properties.contains(key)){
    return this.properties.put(key, this.properties.getProperty.key); 
        
    }
    return this.properties.put(key,value);
  }

  public Object getProperty(int key){
    return this.properties.getOrDefault(key, null);
  }
  public void print(){
    for(Integer displayKey : this.properties.keySet()){
        String value = this.properties.get(displayKey).toString();

        System.out.println(displayKey + " " + value);
    }

  }

  public static void main(String[] args) {
    int[] input = {3,2,2,5,5,1,1,6};
    OccuranceObject counter = new OccuranceObject();
    for (int i = 0; i < input.length; i++){
        counter.setProperty(input[i], 1);

    
    }
    counter.print();
}
}

