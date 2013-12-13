package factoryfun.donnees;

import org.springframework.stereotype.Component;

@Component
public class JoueurProvider
{
	
	private Joueur joueur;
	
	public JoueurProvider()
	{
		System.out.println("*** Initialisation PlateauProvider ***");
		
		joueur = new Joueur();
	}
	
	public Joueur getJoueur()
	{
		return joueur;
	}
	
}