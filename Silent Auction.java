import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numBider = input.nextInt();
        ArrayList<String> bider = new ArrayList<>();
        ArrayList<Integer> ammount = new ArrayList<>();


       while(numBider-- > 0)
       {
           input.nextLine();
           String biderName = input.nextLine();

           int bidAmmount = input.nextInt();

           bider.add(biderName);
           ammount.add(bidAmmount);


       }
           int finalBid = ammount.get(0);
           int index = 0;
        for (int i = 1; i < bider.size(); i++) {
            if(finalBid < ammount.get(i)) {
                finalBid = ammount.get(i);
                index = i;
            }
        }
        System.out.println(bider.get(index));


    }

}


