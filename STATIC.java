class mobile { // class is loaded only once

    String brand;
    int price;
    static String name; // same for all objects changing one object can change all objects

    public void show() { // we need to create object for running non - static methods
        System.out.println(brand + " : " + price + " : " + name);
    }

    public mobile() { // constructor is called when the object is created
        brand = "";
        price = 200;
        System.out.println("In constructor");
    }

    static {
        name = "SmartPHone";
        System.out.println("In static block"); // static block runs only once that to when the class loads
    }

    public static void show1(mobile obj) { // static methods dont need object creation, they are loaded when class loads but only run when explitly called
        // System.out.println(brand + " : " + price + " : " + name); // brand and price are non-static variables
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }

    public static void print() {
        System.out.println("instatic method");
    }

}

public class STATIC {

    public static void main(String args[]) {
        mobile obj1 = new mobile(); // class loads when first object is created
        obj1.brand = "Apple";
        obj1.price = 1500;

        mobile obj2 = new mobile(); // 2nd object created from already loaded class
        obj2.brand = "Samsung";
        obj2.price = 1700;

        obj1.show();
        obj2.show();

        obj2.name = "Mobile phone"; // changing static variable (can change using object but bad practice static
                                    // variable belongs to class)
        obj1.show();
        obj2.show();

        mobile.name = "SmartPhone"; // static variable can be access by class name
        obj1.show();
        obj2.show();

        mobile.show1(obj1);
        mobile.print();
    }

}

// javac STATIC.java
//    ↓
// (no execution happens)

// java STATIC
//    ↓
// JVM starts
//    ↓
// STATIC class loaded
//    ↓
// (static blocks of STATIC run)
//    ↓
// JVM calls main()
//    ↓
// new Mobile()
//    ↓
// Mobile class loaded
//    ↓
// (static block of Mobile runs)
//    ↓
// Mobile constructor runs
