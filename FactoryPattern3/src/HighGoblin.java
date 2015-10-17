/**
 * Created by Answer on 2015-10-05.
 */
public class HighGoblin extends Monster {

    MonsterArmory monsterArmory;

    public HighGoblin(MonsterArmory monsterArmory) {
        this.monsterArmory = monsterArmory;
        name = "HighGoblin";
        healthPoint = 800;
        manaPoint = 150;
        this.weapon = monsterArmory.createWeapon();
        this.armor = monsterArmory.createArmor();
    }
}
