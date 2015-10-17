/**
 * Created by Answer on 2015-10-03.
 */
public class SmartPhone3G extends SmartPhone {
    public SmartPhone3G() {
        internetFucntion = new Internet3G();
        bluetoothFunction = new Bluetooth2();
    }

    @Override
    public void call() {
        super.call();
        System.out.println("3G");
    }
}
