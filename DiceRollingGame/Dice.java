package DiceRollingGame;
import java.util.Random;

public class Dice {
    private int value;

    public Dice(){
        this.value =1;
    }

    public void roll(){
        Random random = new Random();
        value = random.nextInt(6) + 1;
    }

    public int getValue(){
        return value;
    }
}
