/**
 * Created by Answer on 2015-10-05.
 */
public class NormalServer extends MonsterServer3 {

    @Override
    public Monster createMonster(String type) {

        MonsterArmory normalArmory = new NormalArmory();

        if(type.equals("NormalOrk"))
            return new NormalOrk(normalArmory);
        else if(type.equals("NormalGoblin"))
            return new NormalGoblin(normalArmory);
        else if(type.equals("NormalSkeleton"))
            return new NormalSkeleton(normalArmory);
        else
            return null;
    }
}
