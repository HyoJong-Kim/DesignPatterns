/**
 * Strategy1.Character : Strategy1.Magician
 * Created by HyoJong on 2015-09-19.
 */
public class Magician implements Character {
    public Magician() {
    }

    @Override
    public void doAttack() {
        System.out.println("Magical Attack!!");
    }

    @Override
    public void doMove() {
        System.out.println("Blink");
    }

    @Override
    public void display() {
        System.out.println("Display .Magician");
    }
}
