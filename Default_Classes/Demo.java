package Default_Classes;
//ERROR Demo.java:21: error: types A and D are incompatible;
// class B implements A, D{
// ^
//   class B inherits unrelated defaults for dance() from types A and D
// 1 error
 


interface A{
    void show();
    default void dance()
    {
        System.out.println("Dance from interface A");
    }

}

interface D
{
    default void dance()
    {
        System.out.println("Dance from interface D");
    }
}
class B implements A, D{
    public void show()
    {
        System.out.println("HI b");
    }
 
}
public class Demo {

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.dance();
       
    }
    
}
