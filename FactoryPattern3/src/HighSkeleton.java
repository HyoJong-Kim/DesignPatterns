/**
 * Created by Answer on 2015-10-05.
 */
public class HighSkeleton extends Monster {

    MonsterArmory monsterArmory;

    public HighSkeleton(MonsterArmory monsterArmory) {
        name = "HighSkeleton";
        healthPoint = 2000;
        manaPoint = 500;
        this.monsterArmory = monsterArmory;
        this.weapon = monsterArmory.createWeapon();
        this.armor = monsterArmory.createArmor();
    }
}
