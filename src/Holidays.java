/*

Write a constructor for the class Holiday, which takes a String representing the name, an int representing the day, and a String representing the month as its arguments, and sets the class variables to these values.

Write a method inSameMonth, which compares two instances of the class Holiday, and returns the Boolean value true if they have the same month, and false if they do not.

Write a method avgDate which takes an array of base type Holiday as its argument, and returns a double that is the average of the day variables in the Holiday instances in the array. You may assume that the array is full (i.e. does not have any null entries).

Write a piece of code that creates a Holiday instance with the name “Independence Day”, with the day “4”, and with the month “July”.
*/
class Holiday {


    private String name;
    private int day;
    private String month;
    public Holiday(String name, int day, String month){

        this.name = name;
        this.day = day;
        this.month = month;
    }
    //
//public boolean inSameMonth(Holiday hol){
//    return this.month.equals(hol.month);
    //using get set using alt insert
    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }
}

public class Holidays{
    static boolean inSameMonth(Holiday H1, Holiday H2) {
        if(H1.getMonth().equals(H2.getMonth()))
            return true;
        else
            return false;
    }

    //
    public static double avgDate(Holiday[] H) {
        int sum = 0;
        for (Holiday h : H) {
            sum = sum + h.getDay();
        }
        return ((double) sum) / H.length;
    }

    public static void main(String[] args){
        Holiday H1 = new Holiday("Independence day", 4, "July");
        Holiday H2 = new Holiday("Christmas", 25, "December");
        Holiday[] H = new Holiday[2];
        H[0] = H1;
        H[1] = H2;
        System.out.println(inSameMonth(H1,H2));
        System.out.println(avgDate(H));


    }

}