class Library <T>
{
    public void print(){
        if (type.equals("Book"))
            System.out.println("This book's name "+name);
        else if (type.equals('v'))
            System.out.println("This video's name is "+name);
        else
            System.out.println("This papers name "+name);
    }
    T type;
    String name;
    public void Library(T type, String name)
    {
        this.name=name;
        this.type=type;
    }
}
public class LibraryGenerics {
    public static void main(String[] args) {
        Library<String> Ele1=new Library<>();
        Ele1.Library("Book", "The diary of Wimpy Kid");
        Ele1.print();
        Library<Character> Ele2=new Library<>();
        Ele2.Library('v', "The Intern");
        Ele2.print();
        Library<Character> Ele3=new Library<>();
        Ele3.Library('P',"News Paper");
        Ele3.print();
    }
}