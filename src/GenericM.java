


 class GenericMethodExample {
     public <T, U> void GenericMethod(T[] arr, U name) {
         for (T item : arr) {
             System.out.println(item);
             System.out.println("Elements with different data type" + name);
         }

     }
 }
public class GenericM{
     public static void main(String[] args) {
         GenericMethodExample obj = new GenericMethodExample();
         String[] arr= {"Bangalore", "Hyderabad", "Chennai"};
         obj.GenericMethod(arr, "Shivani");
     }

 }

