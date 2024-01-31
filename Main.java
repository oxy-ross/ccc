import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // this took 2 hours long.................
        String s = "w \nw \nw \nl \nw";

        Scanner input = new Scanner(System.in);
      /*  do {
            String user = input.nextLine();
            System.out.println(user);
        } while (input.hasNextLine()); */
        // i like this code will look at later
      int winTotal = 0;
        while(input.hasNextLine())
        {
            String line = input.nextLine();
            if("".equals(line))
                break;

              else if(line.equalsIgnoreCase("w"))
               {winTotal++;}

        }
        if(winTotal == 5 || winTotal == 6)
            System.out.println(1);
        else if(winTotal == 3 || winTotal == 4)
            System.out.println(2);
        else if(winTotal == 2 || winTotal == 1)
            System.out.println(3);
        else
            System.out.println(-1);
/*
        while(input.hasNextLine())
       {

           System.out.println(input.nextLine());

       }

        if(winTotal == 5 || winTotal == 6)
            System.out.println(1);
        else if(winTotal == 3 || winTotal == 4)
            System.out.println(2);
        else if(winTotal == 2 || winTotal == 1)
            System.out.println(3);
        else
            System.out.println(-1);
    }

 */}
}