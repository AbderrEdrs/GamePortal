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
				
			case "cb_melting_pot" :
				return new Machine(7, new Canal(Canal.OUT_RIGHT, Canal.RED, 2), new Canal(Canal.IN_CENTER, Canal.ORANGE, 2), new Canal(Canal.IN_RIGHT, Canal.GREEN, 1), new Canal(Canal.IN_LEFT, Canal.BLUE, 2), "cb_melting_pot");
			
			case "cwality_06" :
				return new Machine(8, new Canal(Canal.OUT_RIGHT, Canal.RED, 3), new Canal(Canal.IN_CENTER, Canal.ORANGE, 2), new Canal(Canal.IN_RIGHT, Canal.GREEN, 1), "cwality06");
				
			case "flexfixer" :
				return new Machine(8, new Canal(Canal.OUT_RIGHT, Canal.BLUE, 3), new Canal(Canal.IN_CENTER, Canal.ORANGE, 2), new Canal(Canal.IN_LEFT, Canal.RED, 3), "flexfixer");
				
			case "holl_boxer" :
				return new Machine(7, new Canal(Canal.OUT_RIGHT, Canal.GREEN, 3), new Canal(Canal.IN_CENTER, Canal.BLUE, 2), new Canal(Canal.IN_LEFT, Canal.ORANGE, 3), "holl_boxer");
				
			case "minimega" :
				return new Machine(5, new Canal(Canal.OUT_RIGHT, Canal.RED, 1), new Canal(Canal.IN_LEFT, Canal.BLUE, 1), new Canal(Canal.IN_RIGHT, Canal.ORANGE, 1), "minimega");
				
			case "high_pressor" :
				return new Machine(9, new Canal(Canal.OUT_RIGHT, Canal.ORANGE, 1), new Canal(Canal.IN_LEFT, Canal.RED, 2), new Canal(Canal.IN_CENTER, Canal.GREEN, 1), "high_pressor");
				
			case "megabrowner" :
				return new Machine(5, new Canal(Canal.OUT_RIGHT, Canal.ORANGE, 1), new Canal(Canal.IN_LEFT, Canal.RED, 2), new Canal(Canal.IN_CENTER, Canal.GREEN, 1), "megabrowner");
				
			case "magnetizer" :
				return new Machine(9, new Canal(Canal.OUT_RIGHT, Canal.ORANGE, 1), new Canal(Canal.IN_LEFT, Canal.RED, 2), new Canal(Canal.IN_CENTER, Canal.GREEN, 1), "magnetizer");
			
			case "maximixer" :
				return new Machine(6, new Canal(Canal.OUT_RIGHT, Canal.ORANGE, 1), new Canal(Canal.IN_LEFT, Canal.RED, 2), new Canal(Canal.IN_CENTER, Canal.GREEN, 1), "maximixer");
			
			case "multifilter" :
				return new Machine(6, new Canal(Canal.OUT_RIGHT, Canal.ORANGE, 1), new Canal(Canal.IN_LEFT, Canal.RED, 2), new Canal(Canal.IN_CENTER, Canal.GREEN, 1), "multifilter");
				
			case "minifreezer" :
				return new Machine(7, new Canal(Canal.OUT_RIGHT, Canal.ORANGE, 1), new Canal(Canal.IN_LEFT, Canal.RED, 2), new Canal(Canal.IN_CENTER, Canal.GREEN, 1), "minifreezer");
				
			case "pack-o-matic" :
				return new Machine(6, new Canal(Canal.OUT_RIGHT, Canal.BLUE, 1), new Canal(Canal.IN_LEFT, Canal.RED, 2), new Canal(Canal.IN_CENTER, Canal.GREEN, 1), "pack-o-matic");
					
			case "minigiga-bot" :
				return new Machine(7, new Canal(Canal.OUT_RIGHT, Canal.ORANGE, 1), new Canal(Canal.IN_LEFT, Canal.RED, 2), new Canal(Canal.IN_CENTER, Canal.GREEN, 1), "minigiga-bot");
				
			case "reactor_4.6" :
				return new Machine(7, new Canal(Canal.OUT_RIGHT, Canal.ORANGE, 1), new Canal(Canal.IN_LEFT, Canal.RED, 2), new Canal(Canal.IN_CENTER, Canal.GREEN, 1), "reactor_4.6");
			
			case "verdamp_2.1" :
				return new Machine(5, new Canal(Canal.OUT_RIGHT, Canal.ORANGE, 1),  new Canal(Canal.IN_CENTER, Canal.ORANGE, 2), "verdamp_2.1");
			
			case "supershaker" :
				return new Machine(6, new Canal(Canal.OUT_RIGHT, Canal.ORANGE, 1),  new Canal(Canal.IN_LEFT, Canal.RED, 2), new Canal(Canal.IN_RIGHT, Canal.GREEN, 3), "supershaker");
				
			case "superseal" :
				return new Machine(6, new Canal(Canal.OUT_RIGHT, Canal.BLUE, 1),  new Canal(Canal.IN_CENTER, Canal.GREEN, 2), "superseal");
				
			default :
				return new Machine(3, new Canal(Canal.OUT_LEFT, Canal.BLUE, 1), new Canal(Canal.IN_CENTER, Canal.RED, 3), "minimizer");
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

	@Override
	public String getType() {
		return "Machine";
	}
	
}