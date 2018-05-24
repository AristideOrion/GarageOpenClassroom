package com.moteur.moteurs;

import com.moteur.mes_enums.TypeMoteur;

public class MoteurDiesel  extends Moteur{
	public MoteurDiesel()
	{
		super();
	}

	public MoteurDiesel(TypeMoteur diesel, String mt, int i) {
		// TODO Auto-generated constructor stub
		this.TYPE=TypeMoteur.DIESEL;
		this.CYLINDRE=mt;
		this.PRIX=(double) i;	
	}
	
}
