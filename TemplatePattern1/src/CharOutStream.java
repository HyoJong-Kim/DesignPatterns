/**
 * Created by Answer on 2015-10-10.
 */
public class CharOutStream extends OutStream {

    @Override
    public void print(String str) {
        for(char c : str.toCharArray())
            System.out.println(c);
    }
}
