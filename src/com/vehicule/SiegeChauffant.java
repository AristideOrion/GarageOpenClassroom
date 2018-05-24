package com.vehicule;

import com.vehicule.mes_interfaces.IOption;

public class SiegeChauffant implements IOption,java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static Double  PRIX=(double) 2000;
	
	public SiegeChauffant() {};
	
	
	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return PRIX;
	}


	@Override
	public String getOptionName() {
		// TODO Auto-generated method stub
		return "SiegeChauffant";
	}

}
