package factoryfun.donnees;

import java.util.ArrayList;

public class Partie
{

	private ArrayList<Joueur> joueurs;
	private ArrayList<String> machines;
	private Joueur joueur;
	
	public Partie()
	{
		joueurs = new ArrayList<Joueur>();
		joueur = new Joueur();
		
		machines = new ArrayList<String>();
		
		machines.add("cb_melting_pot");
		machines.add("cwality_06");
		machines.add("flexfixer");
		machines.add("high_pressor");
		machines.add("holl_boxer");
		machines.add("magnetizer");
		machines.add("maximixer");
		machines.add("megabrowner");
		machines.add("minifreezer");
		machines.add("minigiga-bot");
		machines.add("minimega");
		machines.add("minimizer");
		machines.add("multi-fitter");
		machines.add("pack-o-matic");
		machines.add("reactor_4.6");
		machines.add("superseal");
		machines.add("supershaker");
		machines.add("verdamp_2.1");
		
		/*machines.add(Machine.createMachine("cwality_06"));
		machines.add(Machine.createMachine("flexfixer"));
		machines.add(Machine.createMachine("high_pressor"));
		machines.add(Machine.createMachine("holl_boxer"));
		machines.add(Machine.createMachine("magnetizer"));
		machines.add(Machine.createMachine("maximixer"));
		machines.add(Machine.createMachine("megabrowner"));
		machines.add(Machine.createMachine("minifreezer"));
		machines.add(Machine.createMachine("minigiga-bot"));
		machines.add(Machine.createMachine("minimega"));
		machines.add(Machine.createMachine("minimizer"));
		machines.add(Machine.createMachine("multi-fitter"));
		machines.add(Machine.createMachine("pack-o-matic"));
		machines.add(Machine.createMachine("reactor_4.6"));
		machines.add(Machine.createMachine("superseal"));
		machines.add(Machine.createMachine("supershaker"));
		machines.add(Machine.createMachine("verdamp_2.1"));*/
		
		/*machines.add(new Machine(6, Canal.BLUE, 3, new Canal(Canal.IN_LEFT, Canal.RED, 1), new Canal(Canal.IN_CENTER, Canal.BLUE, 1), "multi-fitter"));
		machines.add(new Machine(7, Canal.GREEN, 2, new Canal(Canal.IN_LEFT, Canal.ORANGE, 2), new Canal(Canal.IN_CENTER, Canal.BLUE, 2), "holl_boxer"));
		machines.add(new Machine(8, Canal.RED, 3, new Canal(Canal.IN_CENTER, Canal.GREEN, 1), new Canal(Canal.IN_RIGHT, Canal.ORANGE, 2), "cwality_06"));
		machines.add(new Machine(7, Canal.GREEN, 1, new Canal(Canal.IN_CENTER, Canal.RED, 1), "minifreezer"));
		machines.add(new Machine(8, Canal.BLUE, 1, new Canal(Canal.IN_LEFT, Canal.RED, 3), new Canal(Canal.IN_CENTER, Canal.ORANGE, 2), "flexfixer"));
		machines.add(new Machine(9, Canal.ORANGE, 2, new Canal(Canal.IN_LEFT, Canal.RED, 2), new Canal(Canal.IN_CENTER, Canal.GREEN, 1), "highpressor"));
		machines.add(new Machine(7, Canal.RED, 2, new Canal(Canal.IN_LEFT, Canal.BLUE, 2), new Canal(Canal.IN_CENTER, Canal.ORANGE, 2), new Canal(Canal.IN_RIGHT, Canal.GREEN, 1), "cb_melting_pot"));
		machines.add(new Machine(6, Canal.ORANGE, 1, new Canal(Canal.IN_LEFT, Canal.GREEN, 3), new Canal(Canal.IN_RIGHT, Canal.BLUE, 1), "supershaker"));
		machines.add(new Machine(5, Canal.RED, 1, new Canal(Canal.IN_LEFT, Canal.BLUE, 1), new Canal(Canal.IN_RIGHT, Canal.ORANGE, 1), "minimega"));
		machines.add(new Machine(7, Canal.GREEN, 2, new Canal(Canal.IN_LEFT, Canal.ORANGE, 3), new Canal(Canal.IN_RIGHT, Canal.RED, 3), "reactor_4.6"));*/
	}

	public Joueur getJoueur()
	{
		return joueur;
	}
	
	public String extractMachine()
	{
		int n = (int) (Math.random() * machines.size());
		
		return machines.remove(n);
	}
	
}