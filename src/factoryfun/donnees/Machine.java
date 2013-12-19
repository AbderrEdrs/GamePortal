package factoryfun.donnees;

import java.util.ArrayList;
import java.util.HashMap;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Machine extends Composant
{
	
	private String name;
	private int production;
	private ArrayList<Canal> canaux;
	
	private Machine(int production, Canal output, Canal input, String name)
	{
		super();
		this.production = production;
		
		canaux = new ArrayList<Canal>();
		canaux.add(output);
		canaux.add(input);
		
		this.name = name;
	}
	
	private Machine(int production, Canal output, Canal input_1, Canal input_2, String name)
	{
		super();
		this.production = production;
		
		canaux = new ArrayList<Canal>();
		canaux.add(output);
		canaux.add(input_1);
		canaux.add(input_2);
		
		this.name = name;
	}
	
	private Machine(int production, Canal output, Canal input_1, Canal input_2, Canal input_3, String name)
	{
		super();
		this.production = production;
		
		canaux = new ArrayList<Canal>();
		canaux.add(output);
		canaux.add(input_1);
		canaux.add(input_2);
		canaux.add(input_3);
		
		this.name = name;
	}
	
	public static Machine createMachine(String name)
	{
		switch (name)
		{
			case "minimizer" :
				return new Machine(3, new Canal(Canal.OUT_LEFT, Canal.BLUE, 1), new Canal(Canal.IN_CENTER, Canal.RED, 3), "minimizer");
				
			default :
				return null;
		}
		
	}
	
	public ArrayList<Canal> getCanaux()
	{
		return canaux;
	}

	public int getProduction()
	{
		return production;
	}

	public void setProduction(int production)
	{
		this.production = production;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return name;
	}

	@Override
	public String checkRules(Composant composant)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
}