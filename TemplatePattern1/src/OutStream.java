import java.util.Scanner;

/**
 * Created by Answer on 2015-10-10.
 */
public abstract class OutStream {

    String str;

    final void io()
    {
        input();

        if(str != null)
            print(str);
        else
            System.out.println("Empty!!");
    }

    private void input()
    {
        Scanner scanner = new Scanner(System.in);

        this.str = scanner.nextLine();
    }

    public abstract void print(String str);
}
