interface Calculate{
    void multiply(int x, int y, int s, int t);
}
public class LambdaExpression {
    public static void main(String[] args) {
        Calculate l=(int a, int b, int c , int d) -> {
            System.out.println(c / d);
            System.out.println(a * b);
        };
        l.multiply(2,4, 10, 5);
    }

}
