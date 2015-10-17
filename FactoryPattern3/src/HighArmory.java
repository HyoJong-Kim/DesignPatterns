/**
 * Created by Answer on 2015-10-05.
 */
public class HighArmory implements MonsterArmory {

    @Override
    public Weapon createWeapon() {
        return new Spear();
    }

    @Override
    public Armor createArmor() {
        return new LeatherArmor();
    }
}
