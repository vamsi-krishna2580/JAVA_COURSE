// Encapsulation is a oops principle to restrict the direct access of data using access modifier(.), ensures data security and integrity
class Human {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age; // this refers to same object
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { // setName and setName2 both works as same this give reference to same object
        this.name = name;
    }

    public void setName2(String name, Human obj) {
        obj.name = name;
    }

}

public class Encapsulation {
    public static void main(String[] args) {

        Human obj1 = new Human();
        obj1.setAge(19);
        obj1.setName("Vamsi");

        Human obj2 = new Human();
        obj2.setAge(20);
        obj2.setName2("Krishna", obj2);

        System.out.println(obj1.getAge() + " : " + obj1.getName());
        System.out.println(obj2.getAge() + " : " + obj2.getName());
    }

}

// this(), super() in constructors -- inheritence