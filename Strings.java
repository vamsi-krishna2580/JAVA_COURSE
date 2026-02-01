public class Strings {

    public static void main(String args[]){

        String name = "Vamsi";
        String pet = new String ("Dog");
        System.out.println(pet.hashCode());
        System.out.println(name);
        System.out.println(pet);
        
        System.out.println("Hello " + name);

        System.out.println(name.charAt(1)); // char At
        System.out.println(name.concat(" krishna")); // concatenation

        String s1 = "vamsi";
        String s2 = "vamsi";  // here object is one, references are two in heap "vamsi" is one but s1 and s2 points to it
        System.out.println(s1 == s2); //true



        // String Buffer  ( It is thread safe)
        StringBuffer sb = new StringBuffer("Manoj"); // stringuffer
        System.out.println(sb.capacity()); // buffer capacity
        System.out.println(sb.length()); // string length
        sb.append(" Kumar"); // append
        System.out.println(sb);
    
        String str = sb.toString();  // string buffer to string 
        System.out.println(str);
        
        StringBuffer st = new StringBuffer("Manoj Kumar");
        
        System.out.println(st);
        System.out.println(sb);
        System.out.println(st == sb); //false

        StringBuffer str1 = new StringBuffer("Vamsi Krishna");
        StringBuffer str2 = new StringBuffer("Vamsi Krishna");
        System.out.println(str1 == str2); // false

        str1.delete(2, 6);
        System.out.println(str1);
        String str3 = "pc";
        String str4;
        str4 = str3;
        System.out.println(str4 == str3);

        //String Builder (It is not thread safe)

    }

}
