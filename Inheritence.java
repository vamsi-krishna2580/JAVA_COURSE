// Inheritence simply helps to extend parent class properties to child class
// Java supports Multilevel Inheitence , doesn't support Multiple inheritence

class sci_caluclator extends Caluclator{ 

    // also calls the constructor of parent class
    public sci_caluclator() {
        System.out.println("In Sci_caluclator");
    }
    
    // public int add(int a, int b){     // overides the method add() of parent class
    //     return a*10;      // 20
    // }

    public double  pow(int a, int b){
        return Math.pow(a, b) ;
    }
}

// Multilevel Inheritence 

class A{
    A(){
        System.out.println("In A");
    }
}
class B extends A{
    B(){
        System.out.println("In B");
    }
}



public class Inheritence {

    public static void main(String[] args) {

    sci_caluclator obj = new sci_caluclator();
    int r1 = obj.add(2, 3);
    int r2 = obj.sub(4, 5);
    int r3 = obj.mul(6, 7);
    double r4 = obj.div(8, 9);
    double r5 = obj.pow(8,6);
    System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);

    }

}
