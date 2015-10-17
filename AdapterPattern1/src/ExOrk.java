/**
 * Created by Answer on 2015-10-09.
 */
public class ExOrk extends ExMonster {

    public ExOrk() {
    }

    @Override
    public void doAttack() {
        System.out.println("Ork Attack");
    }

    @Override
    public void doMove() {
        System.out.println("Ork Move");
    }

    @Override
    public void display() {
        System.out.println("Display Ork");
    }
}
