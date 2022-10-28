
import java.util.*;

public class Main {
    public List<String>buttonValues = Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"," ");

    Main(){
        Collections.shuffle(buttonValues);
        GameFrame gameFrame = new GameFrame();
    }
    public static void main(String[] args) {
        Main main = new Main();
    }
}
