package com.moteur.moteurs;

import com.moteur.mes_enums.TypeMoteur;

public abstract class Moteur implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static TypeMoteur TYPE;
	public static String CYLINDRE;
	public static Double PRIX;
	
	
	//todo Methods
	
	public Double getPrix() {
		return PRIX;
	}
	
	public String getType()
	{
		return TYPE.toString();
	}
	

}
