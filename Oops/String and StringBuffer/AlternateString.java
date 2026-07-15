import java.util.Scanner;

public class AlternateString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String a=sc.next();
        String b=sc.next();

        String result="";

        int i=0;

        while(i<a.length() && i<b.length())
        {
            result += a.charAt(i);
            result += b.charAt(i);
            i++;
        }

        while(i<a.length())
        {
            result += a.charAt(i);
            i++;
        }

        while(i<b.length())
        {
            result += b.charAt(i);
            i++;
        }

        System.out.println(result);

        sc.close();
    }
}