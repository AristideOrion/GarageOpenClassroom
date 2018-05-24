package com.vehicule;

import com.vehicule.mes_interfaces.IOption;

public class VitreElectrique implements IOption,java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7935294345634336428L;
	public VitreElectrique(){};
	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getOptionName() {
		// TODO Auto-generated method stub
		return "VitreElectrique";
	}

}
