package comPack.superPack;
class A{
    public int i=5;
    A(){
        System.out.println("Constructor");
    }
    void print(){
        System.out.println("hello");
    }
}
class B extends A{
    B(){
        
        print();
        super.print();
        System.out.println(super.i);
    }
    @Override
    void print(){
        System.out.println("hi");
    }
}
public class Person {
    public static void main(String[] args) {
        B b=new B();
    }
}
