/**
 * Created by Answer on 2015-10-05.
 */
public class HighOrk extends Monster{

    MonsterArmory monsterArmory;

    public HighOrk(MonsterArmory monsterArmory) {
        name = "HighOrk";
        healthPoint = 1000;
        manaPoint = 300;
        this.monsterArmory = monsterArmory;
        this.weapon = monsterArmory.createWeapon();
        this.armor = monsterArmory.createArmor();
    }
}
