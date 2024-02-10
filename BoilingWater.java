import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int waterTemp = input.nextInt();

        int atmosPresure =  5 * waterTemp - 400;

        System.out.println(atmosPresure);
        if( atmosPresure > 100)
            System.out.println(-1);
        else if(atmosPresure < 100)
            System.out.println(1);
        else
            System.out.println(0);

    }
}
