/*
*/
import java.util.*;


public class EnumColor implements MysteryColorAnalyzer{
        @Override
         public int numberOfDistinctColors(List<Color> mysteryColors){
            ArrayList<Color> mysteryColorFound = new ArrayList<>();
            for(Color color:mysteryColors){
                if(!mysteryColorFound.contains(color)){
                    mysteryColorFound.add(color);
                }
            }
            return mysteryColorFound.size();
        }
@Override
    public int colorOccurrence(List<Color> mysteryColors, Color color){
        int number = 0;
        for (Color cl : mysteryColors) {
            if (cl.equals(color)) {
                number++;
            }
        }

        return number;
    }


    public static void main(String[] args) {
        ArrayList<Color> list= new ArrayList<Color>(5);
        list.add(Color.RED);
        list.add(Color.BLUE);
        list.add(Color.GREEN);
        list.add(Color.BLUE);
        list.add(Color.GREEN);
        System.out.println(list);
        System.out.println(new EnumColor().numberOfDistinctcolor(list));
        System.out.println(new EnumColor().colorOccurence(list,Color.BLUE));

    }

    @Override
    public int numberOfDistinctcolor(List<Color> mystercolors) {
        return 0;
    }

    @Override
    public int colorOccurence(List<Color> mysterycolors, Color color) {
        return 0;
    }
}
enum Color{
    RED,
    BLUE,
    GREEN;
}

