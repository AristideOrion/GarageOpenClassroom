import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

import com.vehicule.Vehicule.*;
import com.vehicule.mes_enums.Marque;
import com.vehicule.mes_interfaces.IOption;
import com.moteur.mes_enums.TypeMoteur;
import com.moteur.moteurs.MoteurDiesel;
import com.moteur.moteurs.MoteurElectrique;
import com.vehicule.A300B;
import com.vehicule.Climatiseur;
import com.vehicule.Gps;
import com.vehicule.Lagouna;
import com.vehicule.Vehicule;
public class  Main  {
	public static void main(String[] args) throws IOException {
		//TODO creer garage and charger fichier 
		
		 Garage tonGarage=new Garage();
		 ArrayList<IOption> vosOption = new ArrayList<IOption>();
		vosOption.add(new Climatiseur());
		vosOption.add(new Gps());
		//TODO creation vehicule
		Lagouna modeleV300=new Lagouna(1200,Marque.RENO,vosOption,"Reno_C4");
		modeleV300.setMarque(Marque.PIGEOT);
		modeleV300.setMoteur(new MoteurDiesel(TypeMoteur.DIESEL,"double cylindre",1500));
		modeleV300.addOption(new Climatiseur());
		
		
		Vehicule bmw= new A300B();
		bmw.setMarque(Marque.TROEN);
		bmw.setMoteur(new MoteurElectrique(TypeMoteur.ELECTRIQUE,"Turbo",5000));
		bmw.NOM="X5";
		bmw.PRIX=(double) 2500;
		
		
		//TODO ajouter un vehicule
		tonGarage.addVehicule(modeleV300);
		tonGarage.addVehicule(bmw);
		
		//TODO lister un vehicule
		//tonGarage.getAllVehicule();
		//TODO supprimer un vehicule
		
		//Todo Afficher menu
		Menu my_menu=new Menu();
		my_menu.showMenu();
		//TODO saver
		/*Saver save =new Saver();
		save.serializeSaver(tonGarage);
		save.saverDeserialize();*/
	}

}
