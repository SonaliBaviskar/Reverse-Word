import java.util.*;
class ReverseWord
{
    public static void main(String args[])
    {
        String original ="";
        String reverse="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word");
        original = sc.nextLine();
        
        for(int i =original.length()-1;i>=0;i--)
        {
        reverse = reverse + original.charAt(i);
        }
        System.out.println("Reverse Word is:"  +reverse);
    }
}

        