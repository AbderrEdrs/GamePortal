package factoryfun.donnees;


public class Plateau
{

	private Composant[][] plateau;
	
	Plateau()
	{
		plateau = new Composant[7][15];
		
		Machine m1 = new Machine(4, Canal.BLUE, 5, new Canal(Canal.IN_CENTER, Canal.RED, 5), "<img id=\"ok\" src=\"/assets/factory/img/machine.png\"/>");
		setComposant(m1, 4, 8);
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