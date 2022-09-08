import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int password = 123;
        boolean isPasswordSuccess = false;

        Scanner input = new Scanner(System.in);

        while (!isPasswordSuccess){

            System.out.print("Şifre Giriniz = ");
            password = input.nextInt();

            if (password == 123){
                System.out.println("Şifre Doğru");
                isPasswordSuccess = true;
            }else {
                System.out.println("Şifre Yanlıştır Yeniden Giriniz");
            }

        }

    }
}
