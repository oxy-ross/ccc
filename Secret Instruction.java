import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> turns = new ArrayList<>();
       while(true) {

          String  num = input.nextLine();
          if("99999".equals(num))
              break;

          int sum = Integer.valueOf(num.substring(0,1)) + Integer.valueOf(num.substring(1,2));

            if(sum != 0 &&sum % 2 == 0)
            {   turns.add("right ");
           System.out.println("right " + num.substring(2));}

           else if(sum % 2 != 0)
            {   turns.add("left ");

                System.out.println("left " + num.substring(2));}

           else if(sum == 0)
                System.out.println(turns.get(turns.size()-1) + num.substring(2));


       }


    }

}


