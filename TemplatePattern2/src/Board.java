import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by Answer on 2015-10-10.
 */
public abstract class Board {

    ArrayList list;
    ArrayList premiumList;

    public Board() {
        this.list = new ArrayList();
        this.premiumList = new ArrayList();
    }

    public final void register()
    {
        String title;
        title = input();
        if(preimeumCheck())
            premiumList.add(0, title);
        else
            list.add(0, title);

        display();
    }

    private String input()
    {
        String title;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the Title for goods : ");
        title = scanner.nextLine();

        return title;
    }

    abstract boolean preimeumCheck();

    abstract void display();
}
