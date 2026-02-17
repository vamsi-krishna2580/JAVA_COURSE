class A {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

class B extends A {
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

class C {

    // Functional parameter (Parent type parameter)
    public void printMessage(A obj) {
        System.out.println("Message: " + obj.getMsg());
    }
}

public class prac {
    public static void main(String[] args) {

        B b = new B();
        b.setMsg("Hello from B");
        b.setCode(101);

        C c = new C();

        // Passing child object to parent parameter
        c.printMessage(b);
    }
}
