package Macera_Oyunu;
import java.util.Scanner;
public class Game {

	Player player;
    Location location;
      Scanner scan = new Scanner(System.in);
    public void login()
    {
        System.out.println("Macera Oyununa Hoş Geldiniz!");
        System.out.println("Oyuna başlamadan önce isminizi giriniz :");

        String username = scan.next();
        player = new Player(username);
        player.selectChar();
    }
		

	

}
