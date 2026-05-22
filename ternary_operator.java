public class ternary_operator 
{
    public static void main(String []args)
    {
        int a = 10;

        int score = 0;

        //if(a % 2 == 0)
          //  score = 100 ;                   // if else 
        //else
          //  score = 50;

        score = a % 2== 0 ?100:50;            // ternary operator.

        System.out.println(score);
    
    }    
}
