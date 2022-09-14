public class FindRange {
    public static void main(String[] args) {
        int []Arr = new int [] {5,2,4,1,3,5};
        int low = Arr[0];
        int high = Arr[0];
        for(int i : Arr){
            if(i <= low){
                low = i;
            }
            if(i >= high){
                high = i;
            }
        }
        int range = high - low;
        System.out.println("Range is: " + range);
    }
}
