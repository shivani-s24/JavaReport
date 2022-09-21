public class NameMe {
    String firstName;
    String lastName;
    String fullName;

    public NameMe(String first, String last){
        this.firstName = first;
        this.lastName = last;
        this.fullName = first + " " + last;
    }


    public static void main(String[] args) {
        NameMe N = new NameMe("Donald" , "Trumph");
        System.out.println(N.firstName);
        System.out.println(N.lastName);
        System.out.println(N.fullName);
    }
}
