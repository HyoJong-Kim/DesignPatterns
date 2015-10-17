/**
 * Created by Answer on 2015-10-09.
 */
public class MonsterAdapter implements Character {

    ExMonster exMonster;

    public MonsterAdapter(ExMonster exMonster) {
        this.exMonster = exMonster;
    }

    public void doAttack()
    {
        exMonster.doAttack();
    }

    public void doMove()
    {
        exMonster.doMove();
    }

    public void display() {
        exMonster.display();
    }
}
