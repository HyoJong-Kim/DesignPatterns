/**
 * Simulator : main
 * Created by HyoJong on 2015-09-20.
 */
public class Simulator {

    public static void main(String args[])
    {
        Warrior warrior = new Warrior();
        Magician magician = new Magician();
        Character marketNPC = new MarketNPC();

        warrior.doAttack();
        magician.doAttack();
        marketNPC.doAttack();

        marketNPC.setAttackBehavior(new MagicalAttack());

        marketNPC.doAttack();
    }

}
