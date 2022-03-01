public class factorial {
    public static void main(String[] args) {
        int f=3;
        System.out.println("The factorial of given number is: "+fact(f));
    }
    public static int fact(int a){
        int fac=1;
        for(int i=1;i<=a;i++){
            fac=fac*i;
        }
        return fac;
    }
}