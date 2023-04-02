import java.util.Scanner;
public class pro_6
{
    private String str;
    public pro_6(String str) 
    {
        this.str = str;
    }
    public String reverse() 
    {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public String titleCase() 
    {
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String word : words) 
        {
            if (word.length() > 0) 
            {
                sb.append(Character.toUpperCase(word.charAt(0)));
                sb.append(word.substring(1).toLowerCase());
                sb.append(" ");
    
            }
        }
        return sb.toString().trim();
    }
    public String extractFromRight(int n) 
    {
        if (n >= str.length()) 
        {
            return str;
        }
        return str.substring(str.length() - n);
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        pro_6 myString = new  pro_6(inputString);
        while (true) 
        {
            System.out.println("\nSelect an option:");
            System.out.println("1. Reverse the string");
            System.out.println("2. Convert the string to title case");
            System.out.println("3. Extract N characters from the right-end of the  string");
            System.out.println("4. Exit");
            System.out.print("\nSelect Your Choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) 
            {
                case 1:
                    System.out.println("Reversed string: " + myString.reverse());
                    break;

                case 2:
                    System.out.println("Title case string: " + myString.titleCase());
                    break;

                case 3:
                    System.out.print("Enter the number of characters to extract: ");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Extracted string: " + 
                    myString.extractFromRight(n));
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
