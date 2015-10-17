/**
 * Strategy1.Simulator : main
 * Created by HyoJong on 2015-09-20.
 */
public class Simulator {

    public static void main(String args[])
    {
        Character warrior = new Warrior();

        ExMonster ork = new ExOrk();
        Character monsterAdapter = new MonsterAdapter(ork);

        warrior.display();

        ork.display();

        monsterAdapter.display();
    }

}
