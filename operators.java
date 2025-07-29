public class operators {
    public static void main(String[] args) {
        int a=10,b=20;
        int min = (a>b)?a:b;
        System.out.println("Arithmetic Operation:a+b = "+(a+b));
        System.out.println("Relational Operator:a<=b = "+(a<=b));
        System.out.println("Increment of a = "+(a++));
        System.out.println("Decrement of b = "+(b--));
        System.out.println("Assignment operator a+=2 = "+(a+=2));
        System.out.println("Logical operator of  a and b = "+(a>=10 && b>=10));
        System.out.println("Ternary Operator of a and b:a>b = "+(min));
        
    }    
}
