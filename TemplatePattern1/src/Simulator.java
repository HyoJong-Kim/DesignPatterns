/**
 * Created by Answer on 2015-10-10.
 */
public class Simulator {
    public static void main(String[] args) {

        CharOutStream charOutStream = new CharOutStream();
        StringOutStream stringOutStream = new StringOutStream();

        System.out.println("Character Out Stream");
        charOutStream.io();

        System.out.println("String Out Stream");
        stringOutStream.io();
    }
}
