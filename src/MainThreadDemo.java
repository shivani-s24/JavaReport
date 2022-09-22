public class MainThreadDemo extends Thread{
    public static void main(String[] args) {
//        Thread T = Thread.currentThread();
//        Thread T1 = Thread.currentThread();
//        Thread T2 = Thread.currentThread();
//        System.out.println(T.getName()); //by default the name is main
//        T.setName("T :HI");
//        System.out.println(T.getName());
//        System.out.println(T.getId());
//        System.out.println(T.getState());
//        System.out.println(T.getPriority());
//        T.setPriority(MIN_PRIORITY);
//        System.out.println(T.getPriority());
//
//        System.out.println(T1.getName()); //by default the name is HI
//        T1.setName("T1 :Hello");
//        System.out.println(T1.getName());
//        System.out.println(T1.getId());
//        System.out.println(T1.getState());
//        System.out.println(T1.getPriority());
//
//        System.out.println(T2.getName()); //by default the name is Hello
//        T2.setName("T2 :Bye-Bye");
//        System.out.println(T2.getName());
//        System.out.println(T2.getId());
//        System.out.println(T2.getState());
//        System.out.println(T2.getPriority());
//        T.setPriority(MAX_PRIORITY);
//        System.out.println(T2.getPriority());
        try {
            System.out.println("Entering the deadlock");
            Thread.currentThread().join(); //waiting thread to blocked or destroyed
            System.out.println("Hi after deadlock");
        }
        catch (Exception e){
            System.out.println("Execption Caught");
        }
    }
}
