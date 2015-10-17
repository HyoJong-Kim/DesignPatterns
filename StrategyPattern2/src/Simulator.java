/**
 * Created by Answer on 2015-10-03.
 */
public class Simulator {

    public static void main(String args[])
    {
        HomePhone homePhone = new HomePhone();
        Celular2G celular = new Celular2G();
        SmartPhone smartPhone = new SmartPhone3G();

        homePhone.doInternet();
        celular.doInternet();
        smartPhone.doInternet();

        smartPhone.setInternetFucntion(new NoInternet());

        smartPhone.doInternet();
    }
}
