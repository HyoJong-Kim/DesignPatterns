/**
 * Created by Answer on 2015-10-05.
 */
public class NormalSever extends MonsterS {

    @Override
    public Monster createMonster(String type) {

        if(type.equals("NormalOrk"))
            return new NormalOrk();
        else if(type.equals("NormalGoblin"))
            return new NormalGoblin();
        else if(type.equals("NormalSkeleton"))
            return new NormalSkeleton();
        else
            return null;
    }
}
