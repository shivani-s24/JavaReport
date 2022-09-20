class College {
    void execute(){
        System.out.println("Jain University");
    }
}
class Course extends College{
    void execute(){
        System.out.println("B-Tech");
    }
}
class Specialization extends Course{
    void execute(){
        System.out.println("CSE");
    }
}
public class DynamicPolymorphismExample{
    public static void main(String[] args) {
        College C = new Specialization();
        C.execute();

    }
}