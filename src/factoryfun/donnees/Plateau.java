package factoryfun.donnees;

import java.awt.Point;
import java.util.ArrayList;

public class Plateau
{

	public static final String LEFT = "left";
	public static final String RIGHT = "right";
	public static final String TOP = "top";
	public static final String BOTTOM = "bottom";
	
	private Composant[][] plateau;
	private ArrayList<Point> exceptions;
	
	Plateau()
	{
		plateau = new Composant[8][10];
		exceptions = new ArrayList<Point>();
		exceptions.add(new Point(9, 6));
		exceptions.add(new Point(9, 7));
		
		//Machine m1 = new Machine(4, Canal.BLUE, 5, new Canal(Canal.IN_CENTER, Canal.RED, 5), "<img id=\"ok\" src=\"/assets/factory/img/machine.png\"/>");
		//setComposant(c, 4, 8);
		/*setComposant(Tuyau.createCrossTuyau(), 2, 12);
		setComposant(Tuyau.createDashTuyau(), 6, 12);
		setComposant(Tuyau.createLTuyau(), 6, 9);*/
	}

	public Composant[][] getPlateau()
	{
		return plateau;
	}
	
	public void setComposant(Composant c, int y, int x)
	{
		plateau[y - 1][x - 1] = c;
	}
	
	public boolean exists(int x, int y)
	{
		if (!(x < 10 && y < 8))
			return false;
		
		for (int i = 0; i < exceptions.size(); i++)
		{
			if (x == exceptions.get(i).getX() && y == exceptions.get(i).getY())
				return false;
		}
		
		return true;
	}
	
	// exploration d'un cote
	//verification des regles du composant pour un cote
	public Message isValid(int x, int y, String side)
	{
		String msg = "";
		
		//COTE DROIT
		while (exists(x, y) && !(msg = plateau[y][x].checkRules(plateau[y][x])).equals("->"));
		
		if (msg.equals("f"))
			return new Message(msg);
		
		
		return new Message(msg);
	}
	
	// LANCEMENT DE LA VERIFICATION COMPLETE DES REGLES DU COMPOSANT p[x][y]
	// exploration des 4 côtés
	public Message check(int x, int y)
	{
		String msg = "";
		
		//COTE DROIT
		/*msg = plateau[y][x].checkRules(plateau, y, x, plateau[y][x].getDirection());
		if ()
		{
		}*/
		
		if (msg.equals("f"))
			return new Message(msg);
		
		
		return new Message(msg);
	}
	
	@Override
	public String toString()
	{
		String affichage = "<table><tbody>";
		
		for (int i = 0; i < plateau.length; i++)
		{
			affichage += "<tr>";
					
			for (int j = 0; j < plateau[i].length; j++)
			{
				String composant = (plateau[i][j] == null) ? "" : plateau[i][j].toString();
				
				affichage += "<td><div>" + composant + "</div></td>";
			}
			
			affichage += "</tr>";
		}
		
		affichage += "</tbody></table>";
		
		return affichage;
	}
	
}