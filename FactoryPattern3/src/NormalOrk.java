/**
 * Created by Answer on 2015-10-05.
 */
public class NormalOrk extends Monster {

    MonsterArmory monsterArmory;

    public NormalOrk(MonsterArmory monsterArmory) {
        name = "Ork";
        healthPoint = 100;
        manaPoint = 20;
        this.monsterArmory = monsterArmory;
        this.weapon = monsterArmory.createWeapon();
        this.armor = monsterArmory.createArmor();
    }
}
