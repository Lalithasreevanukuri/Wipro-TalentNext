import java.util.Scanner;
class Binary{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        String n=sc.next();
        int num = Integer.parseInt(n);
        String binary=Integer.toBinaryString(num);
        String paddedBinary = String.format("%8s", binary).replace(' ', '0');
        System.out.println(paddedBinary);
    }
}