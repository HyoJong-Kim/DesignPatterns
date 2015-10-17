/**
 * Created by Answer on 2015-10-05.
 */
public abstract class MonsterS {

    public abstract Monster createMonster(String type);

    public Monster regenMonster(String type)
    {
        Monster monster;

        monster = createMonster(type);

        monster.regen();

        return monster;
    }
}
