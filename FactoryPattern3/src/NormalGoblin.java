/**
 * Created by Answer on 2015-10-05.
 */
public class NormalGoblin extends Monster {

    MonsterArmory monsterArmory;

    public NormalGoblin(MonsterArmory monsterArmory) {
        this.monsterArmory = monsterArmory;
        name = "Goblin";
        healthPoint = 80;
        manaPoint = 0;
        this.weapon = monsterArmory.createWeapon();
        this.armor = monsterArmory.createArmor();
    }
}
