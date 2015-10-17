/**
 * Created by Answer on 2015-10-04.
 */
public class MonsterServer {

    MonsterFactory monsterFactory;

    public MonsterServer(MonsterFactory monsterFactory) {
        this.monsterFactory = monsterFactory;
    }

    public Monster regenMonster(String type)
    {
        Monster monster;

        monster = monsterFactory.createMonster(type);

        monster.regen();

        return monster;
    }
}
