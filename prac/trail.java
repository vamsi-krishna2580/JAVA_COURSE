package prac;

class A{
    public void show(int a){
        System.out.println("from a");
    }
}
class B extends A{
        public void show(){
        System.out.println("from b");
    }
}

public class trail{
    public static void main(String args[]){
        B obj = new B();
        obj.show(5);
    }
}