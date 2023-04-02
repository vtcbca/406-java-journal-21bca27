import java.util.Scanner;
class Cricketer
{
        public String cname;
        public int nom;
        public void setDataMain() 
        {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the name of Cricketer: ");
                cname = sc.nextLine();
                Scanner sc2 = new Scanner(System.in);
                System.out.print("Enter the Number of matches of Cricketer: ");
                nom = sc2.nextInt();
    }
    public void displayDataMain() 
    {
                System.out.println("Name " +cname);
                System.out.println("Matches " +nom);
    }
}
class Batsman extends Cricketer 
{
            public int total_run;
            public float average;
            public void setData() 
            {
                Scanner sc4 = new Scanner(System.in);
                System.out.print("\nEnter the Total Number of Runs: ");
                total_run = sc4.nextInt();
            }
            public void displayData() 
            {
                System.out.println("Total Runs "+total_run);
            }
}
class Bowler extends Cricketer 
{
            public int wickets;
            public float average;
            public void setData() 
            {
                Scanner sc3 = new Scanner(System.in);
                System.out.print("Enter the number of wickets: ");
                wickets = sc3.nextInt();
            }
            public void displayData() 
            {
                System.out.println("Wickets "+wickets);
            } 
}
public class pro_3
{
            public static void main(String[] args) 
            {
                Bowler bowl = new Bowler();
                Batsman bat = new Batsman();
                Cricketer cal = new Cricketer();
                cal.setDataMain();
                bat.setData();
                bowl.setData();
                cal.displayDataMain();
                bat.displayData();
                bowl.displayData();
                bowl.average = (float) bowl.wickets/cal.nom;
                bat.average = (float) bat.total_run/cal.nom;
                System.out.println("Average_Run's: "+bat.average);
                System.out.println("Average_Wicket's: "+bowl.average);
            }
}
