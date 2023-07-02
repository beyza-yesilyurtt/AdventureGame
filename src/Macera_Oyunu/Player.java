package Macera_Oyunu;
import java.util.Scanner;
public class Player {


private int damage, healthy, money;
private String name, cName;
Inventory inv;
Scanner scan = new Scanner (System.in);
public Player(String name)
{
    this.name = name;
}

public void selectChar()
{
    switch (charMenu())
    {
        case 1:
            setcName("Samuray");
            setDamage(5);
            setHealthy(21);
            setMoney(15);
            break;

        case 2:
            setcName("Okçu");
            setDamage(7);
            setHealthy(18);
            setMoney(20);
            break;

        case 3:
            setcName("Şovalye");
            setDamage(8);
            setHealthy(24);
            setMoney(5);
            break;

        default:
            setcName("Samuray");
            setDamage(5);
            setHealthy(21);
            setMoney(15);
            break;
    }
    System.out.println("Karakter : " + getcName() + "\t Hasar : " + getDamage() + "\t Sağlık : " + getHealthy() + "\t Para : " + getMoney());
}


public void charMenu()
{
	 System.out.println("Lütfen bir karakter seçiniz.");
	 System.out.println("Karakter Listesi");
	 System.out.println(" ---------------------------------------------------------");
	 System.out.println("1-  Samuray \t Hasar : 5 \t Sağlık : 21 \t Para : 15");
	 System.out.println("2-  Okçu \t Hasar : 7 \t Sağlık : 18 \t Para : 20");
	 System.out.println("3-  Şovalye \t Hasar : 8 \t Sağlık : 24 \t Para : 5 ");
	 System.out.println(" ---------------------------------------------------------");

    int chaID = scan.nextInt();

    if(chaID==1)
    {
    	System.out.println("Seçtiğiniz karakter : Samuray");
    }
    else if (chaID==2)
    {
    	System.out.println("Seçtiğiniz karakter : Okçu");
    }
    
    else if(chaID ==3)
    {
    	System.out.println("Seçtiğiniz karakter : Şovalye");
    }

    else
    {
    	System.out.println("Yanlış sayı girdiniz.");
    }

}

public int getDamage()
{
    return damage;
}

public void setDamage(int damage)
{
    this.damage = damage;
}

public int getHealthy()
{
    return healthy;
}

public void setHealthy(int healthy)
{
    this.healthy = healthy;
}

public int getMoney()
{
    return money;
}

public void setMoney(int money)
{
    this.money = money;
}

public String getName()
{
    return name;
}

public void setName(String name)
{
    this.name = name;
}

public String getcName()
{
    return cName;
}

public void setcName(String cName)
{
    this.cName = cName;
}
}
