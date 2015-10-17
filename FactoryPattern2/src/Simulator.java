/**
 * Created by Answer on 2015-10-05.
 */
public class Simulator {

    public static void main(String[] args) {

        MonsterS normalServer = new NormalSever();
        MonsterS highServer = new HighServer();

        Monster monster1;
        Monster monster2;

        monster1 = normalServer.regenMonster("NormalOrk");
        System.out.println(monster1.getName() + " is regenerated\n HP : "
                + monster1.getHealthPoint() + " MP : " + monster1.getManaPoint());

        System.out.println();

        monster2 = highServer.regenMonster("HighSkeleton");
        System.out.println(monster2.getName() + " is regenerated\n HP : "
                + monster2.getHealthPoint() + " MP : " + monster2.getManaPoint());
    }
}
