/**
 * Created by Answer on 2015-10-05.
 */
public class HighSever extends MonsterServer3 {

    @Override
    public Monster createMonster(String type) {

        MonsterArmory highArmory = new HighArmory();

        if(type.equals("HighOrk"))
            return new HighOrk(highArmory);
        else if(type.equals("HighGoblin"))
            return new HighGoblin(highArmory);
        else if(type.equals("HighSkeleton"))
            return new HighSkeleton(highArmory);
        else
            return null;
    }
}
