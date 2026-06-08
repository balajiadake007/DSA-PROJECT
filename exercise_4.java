public class exercise_4 
{
    public static void main(String []args)
    {
        int i = 1;

        System.out.print("For Loop: ");

        for(i = 1;i <= 5;i++)
        {
            System.out.print(i + " ");   
        }

        System.out.println();

        int j = 1;

        System.out.print("While Loop: ");

        while(j <= 5)
        {
            System.out.print(j + " ");

            j++;
        }

        System.out.println();
        
        int k = 1;

        System.out.print("Do-While Loop: ");
        do
        {
            System.out.print(k + " ");

            k++;
        }
        while(k <= 5);
    }
}
