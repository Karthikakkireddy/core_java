package Default_Classes;



interface A{
    void show();

}
class B implements A{
    public void show()
    {
        System.out.println("HI b");
    }

    public void sing()
    {
         System.out.println("SINGING ----- ");
    }
}
public class Demo {

    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.sing();
    }
    
}
