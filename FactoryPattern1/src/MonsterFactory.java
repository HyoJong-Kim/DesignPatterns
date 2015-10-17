/**
 * Created by Answer on 2015-10-04.
 */
public class MonsterFactory {

    public Monster createMonster(String type)
    {
        Monster monster = null;

        if(type.equals("Ork"))
            monster = new Ork();
        else if(type.equals("Goblin"))
            monster = new Goblin();
        else if(type.equals("Skeleton"))
            monster = new Skeleton();

        return monster;
    }
}
