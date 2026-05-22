public class exercise_2 
{
    public static void main(String []args)
    {
        int a = 20;
        int b = 10;

        
        int result1 = a - b;
        int result2 = a * b;
        int result3 = a / b;

        boolean result4 = a > b;
        boolean result5 = a > b && b > 0;

        System.out.println("Addition: "+ (a + b));
        System.out.println("Subtraction: "+ result1);
        System.out.println("Multiplication: "+ result2);
        System.out.println("Division: "+ result3);
        System.out.println("Is a greater than b? "+ result4);
        System.out.println("Is a > b and b > 0? "+ result5);


    }
}
