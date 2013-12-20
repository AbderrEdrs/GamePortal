package factoryfun.donnees;

public class Container extends Composant
{

	public Container()
	{
		super();
	}

	@Override
	public String toString()
	{
		return "S";
	}

	@Override
	public String checkRules(Composant composant)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getType() {
		return "Container";
	}

}