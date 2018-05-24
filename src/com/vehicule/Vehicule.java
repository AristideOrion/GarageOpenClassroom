package com.vehicule;

import java.util.List;

import com.moteur.moteurs.Moteur;
import com.vehicule.mes_enums.*;
import com.vehicule.mes_interfaces.*;

public abstract class Vehicule implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8019273398275566589L;
	public  Double PRIX;
	public  String NOM;
	public static Marque nomMarque;
	public List<IOption> OPTION;
	public static Moteur moteurVehicule;
	public Vehicule() {
	};

	public Vehicule(Double _pri, String _name, List<IOption> _opt) {
		PRIX = _pri;
		NOM = _name;
		OPTION = _opt;
	}

	// TODO fonction vehicule
	public void addOption(IOption opt) {
		
		OPTION.add(opt);
	}

	public Marque getMarque() {

		return nomMarque;
	}
	public List<IOption> getOptions(){
		return OPTION;
	}
	public Double getPrix(){
		return PRIX;
	}
	public void setMarque(Marque m)
	{
		nomMarque=m;
	}
	public void setMoteur(Moteur m)
	{
		this.moteurVehicule=m;
	}
	public String getMoteur()
	{
		return moteurVehicule.getType();
	}
}
