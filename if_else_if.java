public class if_else_if 
{
    public static void main()
    {
        int x = 10;
        int y = 20;
        int z = 30;


        if(x > y && x > z)                  //false
            System.out.println(x);
        else if( y > z)                      //false
            System.out.println(y);
        else
            System.out.println(z);

        
    }
    
}
