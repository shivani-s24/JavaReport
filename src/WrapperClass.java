/* Write your own Wrapper class?

Conditions where finally block will not execute
*/

 class Wrapper {
    int Num;
    public Wrapper(int IntegerNum)
    {
        this.Num=IntegerNum;
    }
    public int getInt()
    {
        return Num;
    }
}
public class WrapperClass
{
    public static void main(String[] args)
    {
        Wrapper Obj=new Wrapper(10);
        System.out.println(Obj.getInt());

    }


}
