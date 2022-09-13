import java.util.Scanner;
public class SwitchCaseCalc {
    public static void main(String[] args) {

        float num1, num2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number:");

        num1 = s.nextFloat();
        System.out.print("Enter second number:");
        num2 = s.nextFloat();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = s.next().charAt(0);

        float output = 0;

        switch(operator)
        {
            case '+':
                output = num1 + num2;
                break;

            case '-':
                output = num1 - num2;
                break;

            case '*':
                output = num1 * num2;
                break;

            case '/':
                output = num1 / num2;
                break;
            default:
                System.out.printf("Wrong operator");

        }

        System.out.println(num1+" "+operator+" "+num2+": "+output);
    }

}
