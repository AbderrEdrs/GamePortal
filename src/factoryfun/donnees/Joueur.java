package factoryfun.donnees;

import java.util.ArrayList;

public class Joueur
{

	private Plateau plateau;
	private ArrayList<Machine> machines;
	private int score;
	
	public Joueur()
	{
		plateau = new Plateau();
	}

	public Plateau getPlateau()
	{
		return plateau;
	}
	
}