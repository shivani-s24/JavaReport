/*Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.



Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
*/
public class Assessment1Contigious {
    int getMaxSum(int []a){

        int MaxSum = 0;
        for(int i=0; i<a.length; i++)
        {
            for(int j= 1; j<a.length; j++)
            {
                int subarraySum = 0;
                for(int k = i; k<=j; k++)
                {
                    subarraySum += a[k];
                }
                    if(subarraySum > MaxSum)
                        MaxSum = subarraySum;

            }

        }
        return MaxSum;
    }

    public static void main(String[] args) {
        Assessment1Contigious A = new Assessment1Contigious();
        int [] a = {-2,1,-3,4,-1,2,1,-5,4};
        int result = A.getMaxSum(a);
        System.out.println(result);
    }
}
