/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

*/
public class Assessment1Paypal {
 String PayPal(String s, int NumOfRows){
    if(s == null || NumOfRows <=0) {
        return "";
    }
     if(NumOfRows ==1)
         return s;
    StringBuilder Result = new StringBuilder();
    int step = 2 * NumOfRows - 2;
    for(int i =0; i<NumOfRows; i++) {
        for (int j = i; j < s.length(); j += step) {
            Result.append(s.charAt(j));
            if (i != 0 && i != NumOfRows - 1) {
                if ((j + step - 2 * i) < s.length()) {
                    Result.append(s.charAt(j + step - 2 * i));
                }
            }
        }
    }
        return Result.toString();


 }

    public static void main(String[] args) {
        Assessment1Paypal PP = new Assessment1Paypal();
        String s = "PAYPALISHIRING";
        System.out.println(PP.PayPal(s,3));
    }
}
