import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GetNumberAlphabet(sc.nextLine());
    }
    public static void GetNumberAlphabet(String txt)
    {
        String[] txtsplit = txt.split("");
        System.out.println(String.join("  ", txtsplit));
        for(int i=0;i<txtsplit.length;i++)
        {
            char letter = txt.charAt(i);
            int num = letter - 'А' + 1;
            if (num>=-991 && num<-974)
                System.out.print("Число ");
            else if (num >=-974 && num <=0) {
                System.out.print("Неверный язык ");
            } else if (num<-991)
                System.out.print(" ");
            else
                System.out.print(num + " ");
        }
    }
}