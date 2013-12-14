package factoryfun.donnees;

import java.util.ArrayList;

public class Partie
{

	private ArrayList<Joueur> joueurs;
	private ArrayList<Machine> machines;
	
	public Partie()
	{
		joueurs = new ArrayList<Joueur>();
		
		machines = new ArrayList<Machine>(10);
		
		machines.add(new Machine(6, Canal.BLUE, 3, new Canal(Canal.IN_LEFT, Canal.RED, 1), new Canal(Canal.IN_CENTER, Canal.BLUE, 1), "multi-fitter"));
		machines.add(new Machine(7, Canal.GREEN, 2, new Canal(Canal.IN_LEFT, Canal.ORANGE, 2), new Canal(Canal.IN_CENTER, Canal.BLUE, 2), "holl_boxer"));
		machines.add(new Machine(8, Canal.RED, 3, new Canal(Canal.IN_CENTER, Canal.GREEN, 1), new Canal(Canal.IN_RIGHT, Canal.ORANGE, 2), "cwality_06"));
		machines.add(new Machine(7, Canal.GREEN, 1, new Canal(Canal.IN_CENTER, Canal.RED, 1), "minifreezer"));
		machines.add(new Machine(8, Canal.BLUE, 1, new Canal(Canal.IN_LEFT, Canal.RED, 3), new Canal(Canal.IN_CENTER, Canal.ORANGE, 2), "flexfixer"));
		machines.add(new Machine(9, Canal.ORANGE, 2, new Canal(Canal.IN_LEFT, Canal.RED, 2), new Canal(Canal.IN_CENTER, Canal.GREEN, 1), "highpressor"));
		machines.add(new Machine(7, Canal.RED, 2, new Canal(Canal.IN_LEFT, Canal.BLUE, 2), new Canal(Canal.IN_CENTER, Canal.ORANGE, 2), new Canal(Canal.IN_RIGHT, Canal.GREEN, 1), "cb_melting_pot"));
		machines.add(new Machine(6, Canal.ORANGE, 1, new Canal(Canal.IN_LEFT, Canal.GREEN, 3), new Canal(Canal.IN_RIGHT, Canal.BLUE, 1), "supershaker"));
		machines.add(new Machine(5, Canal.RED, 1, new Canal(Canal.IN_LEFT, Canal.BLUE, 1), new Canal(Canal.IN_RIGHT, Canal.ORANGE, 1), "minimega"));
		machines.add(new Machine(7, Canal.GREEN, 2, new Canal(Canal.IN_LEFT, Canal.ORANGE, 3), new Canal(Canal.IN_RIGHT, Canal.RED, 3), "reactor_4.6"));
	}

	
	
}