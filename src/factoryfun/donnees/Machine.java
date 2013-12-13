package factoryfun.donnees;

import java.util.ArrayList;
import java.util.HashMap;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Machine extends Composant
{
	
	private int production;
	private ArrayList<Canal> canaux;
	private String img;
	
	public Machine(int production, int couleur_out, int quantite_out, Canal input, String img)
	{
		this.production = production;
		
		canaux = new ArrayList<Canal>();
		canaux.add(new Canal(Canal.OUT, couleur_out, quantite_out));
		canaux.add(input);
		
		this.img = img;
	}
	
	public Machine(int production, int couleur_out, int quantite_out, Canal input_1, Canal input_2, String img)
	{
		this.production = production;
		
		canaux = new ArrayList<Canal>();
		canaux.add(new Canal(Canal.OUT, couleur_out, quantite_out));
		canaux.add(input_1);
		canaux.add(input_2);
		
		this.img = img;
	}
	
	public Machine(int production, int couleur_out, int quantite_out, Canal input_1, Canal input_2, Canal input_3, String img)
	{
		this.production = production;
		
		canaux = new ArrayList<Canal>();
		canaux.add(new Canal(Canal.OUT, couleur_out, quantite_out));
		canaux.add(input_1);
		canaux.add(input_2);
		canaux.add(input_3);
		
		this.img = img;
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

	public String getImg()
	{
		return img;
	}

	public void setImg(String img)
	{
		this.img = img;
	}
	
	@Override
	public String toString()
	{
		return img;
	}
	
}