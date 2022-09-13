import java.util.Scanner;

public class GreatestNumber {
    public static void main (String[]args)
    {
        int num1,num2;
        Scanner s = new Scanner(System.in);
        num1 = s.nextInt();
        num2 = s.nextInt();

        if (num1 > num2)
            System.out.println (num1 + " is greater");

        else
            System.out.println (num2 + " is greater");

    }
}
