import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName ;
        String passWord ;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adını Giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifreyi Giriniz: ");
        passWord = input.nextLine();

        if (userName.equals("patika") && passWord.equals("java123")){
            System.out.print("Giriş Başarılı");
        }else {
            System.out.print("Şifre veya kullanıcı adı yanlış");
        }


    }
}
