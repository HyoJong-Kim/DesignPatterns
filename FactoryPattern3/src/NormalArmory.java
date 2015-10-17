/**
 * Created by Answer on 2015-10-05.
 */
public class NormalArmory implements MonsterArmory {

    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public Armor createArmor() {
        return new ClothArmor();
    }
}
