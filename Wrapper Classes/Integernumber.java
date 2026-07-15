import java.util.Scanner;
class Integernumber{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("java test:");
    int n=sc.nextInt();
    System.out.println("Given number:"+n);
    String binary = Integer.toBinaryString(n);
    System.out.println("Binary equivalent:"+binary);
    String octal = Integer.toOctalString(n);
    System.out.println("Octal equivalent:"+octal);
    String hexadecimal = Integer.toHexString(n);
    System.out.println("Hexadecimal equivalent:"+hexadecimal);
    }
}