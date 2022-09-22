public class CommonPrefix {
    public String Common(String[] S) {
        String prefix = S[0];
        for (int i = 1; i < S.length; i++)
            while (S[i].indexOf(prefix) != 0)
            {  //while(flow.indexOf(flower)!=0) int x= S.indexOf("flight")
                prefix = prefix.substring(0, prefix.length()-1);
                if (prefix.isEmpty()) {
                    return "No prefix found";
                }
            }
        return prefix;
    }
    public static void main(String[] args) {
        CommonPrefix ob = new CommonPrefix();
        String[] s = {"flower", "flow", "flight"};
        String[] s2 = {"cars","caracecar","car"};
        System.out.println(ob.Common(s));
        System.out.println(ob.Common(s2));
    }
}