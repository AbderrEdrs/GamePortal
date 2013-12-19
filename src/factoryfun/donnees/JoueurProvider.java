package factoryfun.donnees;

import org.springframework.stereotype.Component;

@Component
public class JoueurProvider
{
	
	private Partie partie;
	
	public JoueurProvider()
	{
		System.out.println("*** Initialisation PlateauProvider ***");
		
		partie = new Partie();
	}
	
	public Partie getPartie()
	{
		return partie;
	}
	
}