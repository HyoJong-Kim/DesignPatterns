/**
 * Created by Answer on 2015-10-05.
 */
public class Simulator {

    public static void main(String[] args) {

        MonsterFactory monsterFactory = new MonsterFactory();
        MonsterServer monsterServer = new MonsterServer(monsterFactory);
        Monster monster1;
        Monster monster2;

        monster1 = monsterServer.regenMonster("Ork");
        System.out.println(monster1.getName() + " is regenerated\n HP : "
                + monster1.getHealthPoint() + " MP : " + monster1.getManaPoint());

        System.out.println();

        monster2 = monsterServer.regenMonster("Skeleton");
        System.out.println(monster2.getName() + " is regenerated\n HP : "
                + monster2.getHealthPoint() + " MP : " + monster2.getManaPoint());
    }
}
