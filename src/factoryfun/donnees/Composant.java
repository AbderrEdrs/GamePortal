package factoryfun.donnees;

public abstract class Composant
{
	
	private String direction;
	
	public Composant()
	{
		direction = Plateau.RIGHT;
	}
	
	public abstract String checkRules(Composant composant);
	
	@Override
	public abstract String toString();

	public String getDirection()
	{
		return direction;
	}

	public void setDirection(String direction)
	{
		this.direction = direction;
	}
	
}