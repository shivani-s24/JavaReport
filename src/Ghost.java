import java.util.Random;
public class Ghost {
    private static final String[] COLORS = new String[] { "white", "yellow", "purple", "red" };
    private final String color;
    public Ghost()
    {
        color = COLORS[new Random().nextInt(COLORS.length)];
    }
    public String getColor()
    {
        return color;
    }
    public static void main(String[] args) {
       Ghost G = new Ghost();
        System.out.println(G.getColor());
    }
}