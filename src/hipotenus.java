import java.util.Scanner;
public class hipotenus {
    public static void main(String[] args)
    {
        int a,b;
        double c,alan,u;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz :");
        a = input.nextInt();
        System.out.print("2. Kenarı Giriniz :");
        b = input.nextInt();
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs Kenarı Uzunluğu :" + c);
        u = ((a+b+c) /2);
        alan = (u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı :"+alan);


    }
}
