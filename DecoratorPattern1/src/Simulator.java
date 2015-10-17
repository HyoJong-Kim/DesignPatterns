/**
 * Created by Answer on 2015-10-04.
 */
public class Simulator {
    public static void main(String[] args) {

        Rice mixedRice = new MixedRice();
        mixedRice = new FriedEgg(mixedRice);

        System.out.println(mixedRice.getDescription() + " : " + mixedRice.cost() + "원");

        Rice whiteRice = new WhiteRice();

        whiteRice = new Beef(whiteRice);
        whiteRice = new FriedEgg(whiteRice);
        whiteRice = new Bracken(whiteRice);
        whiteRice = new Carrot(whiteRice);

        System.out.println(whiteRice.getDescription() + " : " + whiteRice.cost() + "원");

        Rice blackRice = new Fork(new FriedEgg(new Mushroom(new Spinach(new Carrot(new BeanSprouts(new Cucumber(new BlackRice())))))));

        System.out.println(blackRice.getDescription() + " : " + blackRice.cost() + "원");

    }
}
