package com.vehicule;

import java.util.List;

import com.vehicule.mes_enums.Marque;
import com.vehicule.mes_interfaces.IOption;

public class Lagouna  extends Vehicule{

	public Lagouna() {
		super();
	}

	public Lagouna(Integer i, Marque marq, List<IOption> vosOption,String nomVehicule) {
		// TODO Auto-generated constructor stub
		this.OPTION=vosOption;
		this.PRIX=i.doubleValue();
		this.NOM=nomVehicule;
		
	}
	
}
