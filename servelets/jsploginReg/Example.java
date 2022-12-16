import java.util.regex.*;
import java.util.*;
class Example
{
    public static void main( String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String regex="[0-9]{2}091[aA][0-9]{2}[0-9a-Z]{2}";
        String id=sc.next();
        String pwd=sc.next();
        if(Pattern.matches(regex,id) && Pattern.matches(regex,pwd))
        {
            System.out.print("Valid User");
        }
        else
        {
            System.out.print("Invalid User");
        }
    }
}