public class operators {

        public static void main(String args[]){

        int num1 = 9;
        int num2 = 7;

        int result = 9+7;
        num1 += 2;

        int post = num2++; // post increment
        num2 = 7;

        int pre = ++num2;  // pre increment
        num1--; 

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(result);

        System.out.println(post);
        System.out.println(pre);

        // >, <, >=, <=, ==, != ;

        boolean res = num1 < num2;
        System.out.println(res);
        
        boolean res1 = num1 > num2;
        System.out.println(res1);

    }
}