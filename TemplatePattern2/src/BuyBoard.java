import java.util.Scanner;

/**
 * Created by Answer on 2015-10-10.
 */
public class BuyBoard extends Board {

    @Override
    boolean preimeumCheck() {
        String answer;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want Premium Service?\nIt will let your title on the top of board. (y/n) : ");
        answer = scanner.nextLine();
        if(answer.toLowerCase().equals("y"))
            return true;
        else
            return false;
    }

    @Override
    void display()
    {
        System.out.println("----------Premium Buying----------");
        if(premiumList.size() != 0) {
            for(int i = 0; i < premiumList.size(); i++)
                System.out.println(premiumList.get(i).toString());
        }
        else {
            System.out.println("None");
        }

        System.out.println("--------------Buying--------------");
        if(list.size() != 0) {
            for(int i = 0; i < list.size(); i++)
                System.out.println(list.get(i).toString());
        }
        else {
            System.out.println("None");
        }
    }
}
