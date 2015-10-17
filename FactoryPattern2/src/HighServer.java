/**
 * Created by Answer on 2015-10-05.
 */
public class HighServer extends MonsterS {

    @Override
    public Monster createMonster(String type) {

        if(type.equals("HighOrk"))
            return new HighOrk();
        else if(type.equals("HighGoblin"))
            return new HighGoblin();
        else if(type.equals("HighSkeleton"))
            return new HighSkeleton();
        else
            return null;
    }
}
