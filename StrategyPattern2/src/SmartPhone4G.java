/**
 * Created by Answer on 2015-10-03.
 */
public class SmartPhone4G extends SmartPhone {
    public SmartPhone4G() {
        internetFucntion = new Internet4G();
        bluetoothFunction = new Bluetooth3();
    }

    @Override
    public void call() {
        super.call();
        System.out.println("LTE");
    }
}
