class Mydetails{
    String name = "Shivani";
    int age = 21;
}
class Address extends Mydetails{
    String place = "Maharashtra";
}
class ContactDetails extends Address{ //mutltilevel
    int phno = 1234567890;
}

public class MoreDetails extends ContactDetails implements CollegeName, Hobbies { //multiple inheritance using interfaces.. comments the implement part while executing other programs
    @Override
    public void collegeName()
    {
        System.out.println("Jain University");
    }
    @Override
    public void likes()
    {
        System.out.println("Listening Music");
    }

    public static void main(String[] args) {

        MoreDetails P = new MoreDetails();
        System.out.println(P.name);
        System.out.println(P.age);
        System.out.println(P.place);
        System.out.println(P.phno);
        System.out.println(P.phno);
        System.out.println(P.place);
        P.collegeName();
        P.likes();

    }
}
