import java.util.Scanner;

public class MangoTree {
    public static void main(String[] args) {
        int rows, cols, Tree;
        Scanner S = new Scanner(System.in);
        rows = S.nextInt();
        cols = S.nextInt();
        Tree = S.nextInt();

        if((Tree >= 1 && Tree <= cols) || (Tree % rows == 0) || (Tree % rows ==1 )){
            System.out.println("Yes,It's a Mango Tree");
        }
        else{
            System.out.println("No, It's not a Mango Tree");
        }
    }

}