//static polymorphism
class ArithmeticOperation{
    int area(int A, int B){
        System.out.println("Sum or A and B is");
        return A+B;
    }
    int area(int A, int B, int C)
    {
        System.out.println("Result of the equation is");
        return A*B + C;
    }
}

public class StaticPolymorphism {
    public static void main(String[] args) {
        ArithmeticOperation AO = new ArithmeticOperation();
        System.out.println(AO.area(10,20));
        System.out.println(AO.area(10, 15,20));
    }
}
