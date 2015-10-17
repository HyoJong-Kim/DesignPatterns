/**
 * Created by Answer on 2015-10-05.
 */
public class NormalSkeleton extends Monster {

    MonsterArmory monsterArmory;

    public NormalSkeleton(MonsterArmory monsterArmory) {
        name = "Skeleton";
        healthPoint = 200;
        manaPoint = 50;
        this.monsterArmory = monsterArmory;
        this.weapon = monsterArmory.createWeapon();
        this.armor = monsterArmory.createArmor();
    }
}
