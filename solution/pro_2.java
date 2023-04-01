import java.util.Scanner;
class triangle{
    public static void main (String args[])
    {
        int a,i,j,k=1;

        Scanner sc= new Scanner(System.in);
        System.out.print("How Many row do you want to print:"); 
        a=sc.nextInt();
        for( i=0;i<a;i++)
        {
            for(j=0;j<i;j++,k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
        
    }
}