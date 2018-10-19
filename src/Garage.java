import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vehicule.Lagouna;
import com.vehicule.Vehicule;
import com.vehicule.mes_interfaces.IOption;

public class Garage<T>  implements java.io.Serializable{

	/**
	 * Aristide AMBEMOU dev fullstack
	 */
	/**
	 * 
	 */
	public Integer choix=0;
	public Integer optionChoix[]= {1,2,3};
	public ArrayList<Integer> selectionUser=new ArrayList<>();
	public ArrayList<Integer> selectionUserTest=new ArrayList<>();
	private static final long serialVersionUID = 448258056558427859L;
	List<String>options=new ArrayList<String>() {{
		add("1-GPS");
		add("2-SiegeChauffant");
		add("3-Climatisseur");
	}};
	List<String>marques=new ArrayList<String>() {{
		add("1-Peugeot");
		add("2-Reno");
		add("3-Troen");
	}};
	List<String>vehicules=new ArrayList<String>() {{
		add("1-Lagouna");
		add("2-D4");
		add("3-A3008");
	}};
	

	public ArrayList<T> votreGarage=new ArrayList<>();
	//Constructeur
	public Garage()
	{

	}
	public void addVehicule(Vehicule vvehicule)
	{
		this.votreGarage.add((T) vvehicule);

	}
	public void removeVehicule(Vehicule vVehicule) {
		this.votreGarage.remove(vVehicule);
	}
	public void getAllVehicule() {
		for(T vehi:votreGarage)
		{
			System.out.println("voiture:"+ ((Vehicule) vehi).getMarque());
			//System.out.println( ((Vehicule) vehi).getMoteur());
			System.out.println("Nom:"+((Vehicule) vehi).NOM);
			System.out.println("Prix:"+((Vehicule) vehi).PRIX);

			List<IOption> opt=((Vehicule) vehi).getOptions();
			try
			{
				System.out.println("Les options de votre voitrue sont");

				for(IOption pt :opt) 
				{

					System.out.println(pt.getOptionName()+",");

				}
			}
			catch(NullPointerException e)
			{
				e.getMessage();
			}
		}
	}
	public void addListVehicule(Object vvehicule) {
		// TODO Auto-generated method stub
		
			
	}
	public void listVehicule(List<IOption> myListOption)
	{
		//Affichage des véhicules
		for(String marques:this.vehicules)
		{
			System.out.println(vehicules);
		}

	}
	public void vehiculeAdd(List<IOption> myListOption)
	{

		Vehicule vehiculeUser;
		Scanner in =new Scanner(System.in);
		int cpt=0;
		//Affichage des véhicules
		for(String marque:this.marques)
		{
			System.out.println(marque);
		}

		//AFFICHAGE MENU VEHICULE
		System.out.println("Veuillez Choisir votre véhicule ");

		do
		{

			System.out.println("Saisissez votre type de véhicule");
			choix=in.nextInt();
			selectionUser.add(choix);
			if(choix!=1 && choix!=2 && choix!=3) {
				System.out.println("Veuillez  saisir l'une valeur affiché svp");
			}
			else
			{
				if(choix==1)
				{
					for(String vehicule:this.vehicules)
					{
						System.out.println(vehicule);
					}
					do{
								
							
							System.out.println("Saisissez votre la marque de votre véhicule");
							choix=in.nextInt();
							selectionUser.add(choix);
							if(choix!=1 && choix!=2 && choix!=3) {
								System.out.println("Veuillez  saisir l'une valeur affiché svp");
							}
							else
							{
								if(choix==1)
								{
									Vehicule vehicuLagouna=new Lagouna();
									for(IOption valueOpt:myListOption)
									vehicuLagouna.addOption(valueOpt);
									vehicuLagouna.getOptions();
									this.addVehicule(vehicuLagouna);
								}
							}
					}while(choix!=1 && choix!=2 && choix!=3);
				}
			}
			System.out.println("------------------------------------------------------------------");
		}while(choix!=1 && choix!=2 && choix!=3);
		
		
		System.out.println("------------------------------------------------------------------");
		
	}
	public List<IOption> listAddOtpion()
	{

		ArrayList<IOption> optionsUser=new ArrayList<>();
		Scanner in =new Scanner(System.in);
		int cpt=0;


		//Affichage des options
		for(String opt:this.options)
		{
			System.out.println(opt);
		}

		//AFFICHAGE MENU
		System.out.println("Veuillez saisir les options que vous désirez, vous ne pouvez que mettre 3 options au maximun");

		do
		{

			System.out.println("Saisissez votre option");
			choix=in.nextInt();
			if(cpt!=0)
			{
				for(Integer selec:selectionUserTest)
				{
					if(selec.equals(choix))
					{
						System.out.println("Veuillez choisir une ature option svp");
					}
					else
					{
						selectionUser.add(choix);
						selectionUserTest.add(choix);
						break;
					}
				}
			}
			if(cpt==0)
			{
				selectionUser.add(choix);
				selectionUserTest.add(choix);

			}
			System.out.println("Desirez vous arreter? si oui veuillez taper 5 sinon un autre nombre");
			choix=in.nextInt();
			cpt++;
			System.out.println("------------------------------------------------------------------");
		}while((choix.intValue()!=5));
		for(Integer inp:selectionUser)
		{
			System.out.println(inp);
		}
		System.out.println("------------------------------------------------------------------");
		return optionsUser;
	}

}