package factoryfun.donnees;

public class Canal
{
	
	public static final String IN_LEFT = "input_left";
	public static final String IN_CENTER = "input_center";
	public static final String IN_RIGHT = "input_right";
	public static final String OUT = "output";
	
	public static final int RED = 1;
	public static final int GREEN = 2;
	public static final int BLUE = 3;
	public static final int ORANGE = 4;
	
	private String position;
	private int couleur;
	private int quantite;
	
	public Canal(String position, int couleur, int quantite)
	{
		this.position = position;
		this.couleur = couleur;
		this.quantite = quantite;
	}
	
	public String getPosition()
	{
		return position;
	}

	public void setPosition(String position)
	{
		this.position = position;
	}

	public int getCouleur()
	{
		return couleur;
	}

	public void setCouleur(int couleur)
	{
		this.couleur = couleur;
	}

	public int getQuantite()
	{
		return quantite;
	}

	public void setQuantite(int quantite)
	{
		this.quantite = quantite;
	}
	
}