// Anthony Brillantes
// COP 2805C – 91339
// 06/30/24

package p6;

public class NumbersDoNotBelongInText extends Exception 
{   
    String errorCause = "";
    public NumbersDoNotBelongInText(String word) {
        super("Word contains numbers and was removed: " + word);
        this.errorCause = word;
    }

    public String getErrorCause(){
        return this.errorCause;
    }
}
