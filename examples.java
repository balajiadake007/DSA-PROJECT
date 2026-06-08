class examples 
{
    int add(int a , int b)
    {
        return a * b;
    }

    int count(int a , int b , int c , int d)
    {
        return a + b + c + d;
    }

    double g(double a , double b)
    {
        return a - b;
    }

    public static void main(String[] args)
    {
        examples a = new examples();

        System.out.println(a.add(5,5));
        System.out.println(a.count(1,2,3,4));
        System.out.println(a.g(1.5,0.5));
        
    }

}   
