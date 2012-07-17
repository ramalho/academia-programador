public class Operadores {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 4;
    
        int x1 = a * 6 + b * 5;
        System.out.println("x1:" + x1);
        double x2 = (double)20/b * 2;
        System.out.println("x2:" + x2);        
        int x3 = 20/b * 2;
        System.out.println("x3:" + x3); 
        int x4 = b + 3 * 2 - a * 2 / (5 - c);
        System.out.println("x4:" + x4);
        int x5 = a % b;
        System.out.println("x5:" + x5);
    }    
}