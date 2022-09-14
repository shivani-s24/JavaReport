import java.util.Scanner;

public class CollatzQues {
    public static void main(String[] args) {
        int num;
        Scanner S = new Scanner(System.in);
        num = S.nextInt();
        if(num == 1){
            System.out.println(" 1 \n 0");
        }
         while(num != 1) {
             System.out.println(num + " ");
             if ((num % 2) == 1) {
                 num = 3 * num + 1;
             } else {
                 num = num / 2;
             }
             System.out.println(num);
         }

    }

}
