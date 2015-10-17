/**
 * Created by Answer on 2015-10-03.
 */
public class HomePhone extends Phone {

    public HomePhone()
    {
        internetFucntion = new NoInternet();
        cameraFunction = new NoCamera();
        bluetoothFunction = new NoBluetooth();
    }

    @Override
    public void call() {
        super.call();
        System.out.println("HomePhone");
    }
}
