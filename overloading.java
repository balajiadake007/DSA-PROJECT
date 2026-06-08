public class overloading
{

    static class calculator
    {
    
        int hi(int a , int b) 
        {
            return a * b; 
        }

        int add(int a , int b, int c)
        {
            return a + b + c;
        }

        float add(float a , float b)
        {
            return a - b;
        }

    }
    public static void main(String[] args)
    {
        calculator R = new calculator();

        System.out.println(R.hi(7,3));
        System.out.println(R.add(7,3,1));
        System.out.println(R.add(2.5f,1.5f));
    }
}

