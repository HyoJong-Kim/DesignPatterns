/**
 * Created by Answer on 2015-10-04.
 */
public abstract class Monster {

    public String name;
    public int healthPoint;
    public int manaPoint;

    public void regen()
    {
        System.out.println("Regenerating " + getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getManaPoint() {
        return manaPoint;
    }

    public void setManaPoint(int manaPoint) {
        this.manaPoint = manaPoint;
    }

}
