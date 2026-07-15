import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.next();

        System.out.print("Enter second string: ");
        String b = sc.next();

        String result;

        if (a.charAt(a.length()-1) == b.charAt(0))
            result = a + b.substring(1);
        else
            result = a + " " + b;

        System.out.println(result.toLowerCase());

        sc.close();
    }
}