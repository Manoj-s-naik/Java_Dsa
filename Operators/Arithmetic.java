public class Arithmetic{
    public static void main(String[] args) {
        // Binary operators
        int a = 10;
        int b = 5;
        // System.out.println("addition :" + (a+b));
        // System.out.println("substraction :" + (a-b));
        // System.out.println("multiplication :" + (a*b));
        // System.out.println("devide :" + (a/b));
        // System.out.println("modulo :" + (a%b));
        // Unary operator
        int preIncrement = ++a;
        int postIncrement = a++;
        System.out.println(preIncrement);
        System.out.println(postIncrement);
        System.out.println(a);
        int postDecrement = --a;
        int preDecrement = a--;
        System.out.println(postDecrement);
        System.out.println(preDecrement);
    }
}
