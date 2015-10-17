/**
 * Created by Answer on 2015-10-10.
 */
public class Simulator {
    public static void main(String[] args) {
        SellBoard sellBoard = new SellBoard();
        BuyBoard buyBoard = new BuyBoard();

        sellBoard.register();

        System.out.println();

        buyBoard.register();
    }
}
