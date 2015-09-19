/**
 * Character : MarketNPC
 * Created by HyoJong on 2015-09-19.
 */
public class MarketNPC extends Character {
    public MarketNPC() {
        attackBehavior  =   new NoAttack();
        moveBehavior    =   new NoMove();
    }

    @Override
    public void display() {
        System.out.println("Display NPC");
    }
}
