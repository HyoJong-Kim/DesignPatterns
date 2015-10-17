/**
 * Phone Super Class
 * Created by Answer on 2015-10-03.
 */
public abstract class Phone {

    InternetFunction internetFucntion;
    CameraFunction cameraFunction;
    BluetoothFunction bluetoothFunction;

    public Phone() {}

    public void doInternet()
    {
        internetFucntion.internet();
    }

    public void setInternetFucntion(InternetFunction function)
    {
        internetFucntion = function;
    }

    public void doCapture()
    {
        cameraFunction.Camera();
    }

    public void setCameraFunction(CameraFunction function)
    {
        cameraFunction = function;
    }

    public void doBluetooth()
    {
        bluetoothFunction.bluetooth();
    }

    public void setBluetoothFunction(BluetoothFunction function)
    {
        bluetoothFunction = function;
    }

    public void call()
    {
        System.out.print("Calling by ");
    }
}
