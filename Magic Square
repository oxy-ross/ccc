
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
       int sum = 0;
        String num ="";
        int checkValue = 0;
       int row =  0;

        while (input.hasNextLine()) {
            String userInput = input.nextLine();



                    for (int i = 0; i < userInput.length(); i++) {

                        if (Character.isDigit(userInput.charAt(i))) {
                            num += userInput.charAt(i);
                        }
                        if ( !Character.isDigit(userInput.charAt(i)) || i == userInput.length() - 1) {
                            { sum += Integer.valueOf(num);

                            num = "";
                            }

                        }



                    }
                    if (row == 0) {
                checkValue = sum;

                row ++;
            }
                if (checkValue != sum) {

                    System.out.println("not magic");
                    break;
                }
                else
                {


                      sum = 0;
                      row++;
                     if(row == 5) {
                         System.out.println("magic");
                         break;
                     }

                }


        }


}
}
