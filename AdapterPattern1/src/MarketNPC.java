/**
 * Strategy1.Character : Strategy1.MarketNPC
 * Created by HyoJong on 2015-09-19.
 */
public class MarketNPC implements Character {
    public MarketNPC() {
    }

    @Override
    public void doMove() {
        System.out.println("No Move");
    }

    @Override
    public void doAttack() {
        System.out.println("No Attack");
    }

    @Override
    public void display() {
        System.out.println("Display NPC");
    }
}
