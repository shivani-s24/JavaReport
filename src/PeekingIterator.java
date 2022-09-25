
public class PeekingIterator
{
    public int [] arr;
    int pointer;
    public PeekingIterator(int [] arr)
    {
        this.arr=arr;
        pointer=0;
    }
    public int next()
    {
        pointer++;
        return arr[pointer];
    }
    public boolean hasnext()
    {
        boolean bol=false;
        if(arr.length-pointer==0)
        {
            bol=true;
        }
        return bol;
    }
    public int peek()
    {
        int pointer1=pointer+1;
        int pointer2=arr[pointer1];
        return pointer2;
    }

    public static void main(String[] args)
    {
        int[] arr1={1,2,3,4};
        PeekingIterator it=new PeekingIterator(arr1);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]);
        }
        System.out.println();
        System.out.println(it.next());
        System.out.println(it.peek());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.hasnext());
    }
}