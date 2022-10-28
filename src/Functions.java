import java.util.List;

public class Functions {

    //kontrollfunktioner

    public boolean checkWon(String toCheck){
        boolean hasWon = false;
        if(toCheck.equals("123456789101112131415 ")){
            hasWon=true;
        }
        return hasWon;
    }


}
