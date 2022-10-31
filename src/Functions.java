import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Functions {

    //kontrollfunktioner
    public List<String>buttonValues = Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"," ");

    public List<String> getList(){
        //Collections.shuffle(buttonValues);
        return buttonValues;
    }

    public boolean checkWon(String toCheck){
        boolean hasWon = false;
        if(toCheck.equals("123456789101112131415 ")){
            hasWon=true;
        }
        return hasWon;
    }
    public void randomizeOrder(){
        Collections.shuffle(buttonValues);
    }
}
