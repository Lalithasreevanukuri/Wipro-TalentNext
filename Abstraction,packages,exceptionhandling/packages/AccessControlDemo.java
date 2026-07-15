class Foundation {

    private int var1 = 10;
    int var2 = 20;
    protected int var3 = 30;
    public int var4 = 40;


    public int getVar1() {
        return var1;
    }
}


public class AccessControlDemo {

    public static void main(String[] args) {

        Foundation f = new Foundation();

        System.out.println("Private var1 : " + f.getVar1());
        System.out.println("Default var2 : " + f.var2);
        System.out.println("Protected var3 : " + f.var3);
        System.out.println("Public var4 : " + f.var4);

    }
}