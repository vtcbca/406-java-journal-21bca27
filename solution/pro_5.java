public class pro_5 extends Exception 
{
    public pro_5(String message) 
    {
        super(message);
    }

    public static void main(String[] args) 
    {
        try 
        {
            int num = Integer.parseInt(args[0]);
            if (String.valueOf(num).length() % 2 != 0) 
            {
                throw new pro_5("Number has odd number of digits!");
            } 
            else 
            {
                System.out.println("Number has even number of digits.");
            }
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Invalid number format.");
        } 
        catch (pro_5 e) 
        {
            System.out.println(e.getMessage());
        }
    }
}

