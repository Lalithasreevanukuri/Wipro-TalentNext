import java.util.Scanner;

public class BeforeAfterString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String a=sc.next();
        String b=sc.next();

        String result="";

        int index=a.indexOf(b);

        while(index!=-1)
        {
            if(index>0)
                result += a.charAt(index-1);

            if(index+b.length()<a.length())
                result += a.charAt(index+b.length());

            index=a.indexOf(b,index+1);
        }

        System.out.println(result);

        sc.close();
    }
}