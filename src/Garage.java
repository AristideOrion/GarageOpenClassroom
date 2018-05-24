import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.vehicule.Vehicule;
import com.vehicule.mes_interfaces.IOption;

public class Garage<T>  implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 448258056558427859L;
	/**
	 * 
	 */

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
						
						System.out.print(pt.getOptionName()+",");
						
					}
				}
				catch(NullPointerException e)
				{
						e.getMessage();
				}
		}
	}
	public void addVehicule(Object vvehicule) {
		// TODO Auto-generated method stub
		
	}
	
}
