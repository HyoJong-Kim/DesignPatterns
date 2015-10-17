/**
 * Created by Answer on 2015-10-04.
 */
public class Simulator {

    public static void main(String[] args) {

        Bicycle road = new Road();

        road = new Light(road);
        road = new SpeedMeter(road);
        road = new Cradle(road);

        System.out.println(road.getDescription() + " : " + road.cost() + "원");

        Bicycle hybrid = new Hybrid();

        System.out.println(hybrid.getDescription() + " : " + hybrid.cost() + "원");

        Bicycle minibello = new Bucket(new Minibello());

        System.out.println(minibello.getDescription() + " : " + minibello.cost() + "원");
    }
}
