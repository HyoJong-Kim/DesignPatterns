/**
 * Created by Answer on 2015-10-03.
 */
public class Celular2G extends Phone{

    public Celular2G() {
        internetFucntion = new Internet2G();
        cameraFunction = new BasicCamera();
        bluetoothFunction = new NoBluetooth();
    }

    @Override
    public void call() {
        super.call();
        System.out.println("2G Phone");
    }
}
