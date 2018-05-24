package com.vehicule;

import com.vehicule.mes_interfaces.IOption;

public class Gps implements IOption,java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6726928567496404329L;
	public static Double  PRIX=(double) 3000;
	public Gps() {
		
	}
	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return PRIX;
	}
	@Override
	public String getOptionName() {
		// TODO Auto-generated method stub
		return "Gps";
	}

}
