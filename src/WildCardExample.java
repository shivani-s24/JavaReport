import java.util.ArrayList;
import java.util.List;

public class WildCardExample {
    public static void main(String[] args) {
        List<String> StringList = new ArrayList<>();
        StringList.add("Bangalore");
        StringList.add("Hyderabad");
        DisplayList(StringList);
        List<Character> CharList = new ArrayList<>();
        CharList.add('S');
        CharList.add('D');
        DisplayList(CharList);

    }
    public static void DisplayList(List <?> completeList)
    {
        System.out.println(completeList);
    }
}
