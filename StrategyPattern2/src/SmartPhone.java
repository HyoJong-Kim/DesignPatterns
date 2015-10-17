/**
 * Created by Answer on 2015-10-03.
 */
public class SmartPhone extends Phone {

    public SmartPhone() {
        cameraFunction = new BasicCamera();
    }

    @Override
    public void call() {
        super.call();
        System.out.print("SmartPhone ");
    }
}
