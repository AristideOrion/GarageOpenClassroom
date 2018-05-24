package com.vehicule;

import com.vehicule.mes_interfaces.IOption;

public class BarreDeToit  implements IOption,java.io.Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1923614858259774980L;
	public BarreDeToit() {
		
	}
	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getOptionName() {
		
		return "BarreDetoit";
	}

}
