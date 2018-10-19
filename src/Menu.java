import java.io.IOException;
import java.util.Scanner;

public class Menu {
	
	public Integer choix=5;
	public Scanner lect = new Scanner(System.in);
	public static Saver save=new Saver();
	public Menu() {}
	
	public <T> void showMenu() 
	{
		while(choix != 4)
		{
			System.out.println("------------------Garage à l'ivoirienne----------------------");
			System.out.println("1-Lister mes véhicules");
			System.out.println("2-Ajouter un véhicule");
			System.out.println("3-Supprimer un véhicule");
			System.out.println("4-Quitter le garage");
			System.out.println("Faites votre choix svp");
			
			
			
			try 
			{
				choix=lect.nextInt();
				//Todo switch case
				
				switch(choix)
				{
				case 1:
					System.out.println("----------------------------------------");
					System.out.println("Voici  votre liste de véhicule");
					save.saverDeserialize();
					System.out.print("----------------------------------------");
					
					break;
				case 2 :
					System.out.println("----------------------------------------");
					System.out.println("Un nouveau véhicule, ci-dessous la liste des options");
					Garage<T> gara=new Garage<>();
					gara.vehiculeAdd(gara.listAddOtpion());
					System.out.print("----------------------------------------");
					
					break;
				case 3 :
					System.out.println("Vous voulez supprimer un véhicule");
					break;
				case 4:
					System.out.println("Au revoir en pensant vous revoir");
					break;
				default:
					System.out.println("Vous ne savez pas quoi choisir");
				
				}
				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				
			}
		}
	}

}
