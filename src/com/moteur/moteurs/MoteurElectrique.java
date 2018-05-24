package com.moteur.moteurs;

import com.moteur.mes_enums.TypeMoteur;

public class MoteurElectrique  extends Moteur{
	
	public  MoteurElectrique()
	{
		super();
	}
	public MoteurElectrique(TypeMoteur electrique, String cylindre, int prix) {
		// TODO Auto-generated constructor stub
		this.TYPE=electrique;
		this.CYLINDRE=cylindre;
		this.PRIX=(double) prix;
	}
	
}
