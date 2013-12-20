package factoryfun.donnees;

import java.util.ArrayList;

public class Connector extends Composant
{

	public static final int LEFT = 1;
	public static final int RIGHT = 2;
	public static final int TOP = 3;
	public static final int BOTTOM = 4;
	
	private ArrayList<Integer> inputs;
	private String img;
	
	private Connector(int input, String img)
	{
		super();
		inputs = new ArrayList<Integer>();
		inputs.add(input);
		
		this.img = img;
	}
	
	private Connector(int input_1, int input_2, String img)
	{
		inputs = new ArrayList<Integer>();
		inputs.add(input_1);
		inputs.add(input_2);
		
		this.img = img;
	}
	
	private Connector(int input_1, int input_2, int input_3, String img)
	{
		inputs = new ArrayList<Integer>();
		inputs.add(input_1);
		inputs.add(input_2);
		inputs.add(input_3);
		
		this.img = img;
	}
	
	private static Connector createCompleteTuyau(String img)
	{
		Connector t = new Connector(LEFT, img);
		
		t.addTuyau(LEFT);
		t.addTuyau(RIGHT);
		t.addTuyau(TOP);
		t.addTuyau(BOTTOM);
		
		return t;
	}

	public static Connector createCrossTuyau()
	{
		return createCompleteTuyau("+");
	}
	
	public static Connector createLTuyau()
	{
		return new Connector(TOP, RIGHT, "L");
	}
	
	public static Connector createITuyau()
	{
		return new Connector(TOP, BOTTOM, "I");
	}
	
	public static Connector createDashTuyau()
	{
		return new Connector(LEFT, RIGHT, "-");
	}
	
	public void addTuyau(int input)
	{
		inputs.add(input);
	}
	
	public ArrayList<Integer> getInputs()
	{
		return inputs;
	}

	@Override
	public String toString()
	{
		return img;
	}

	@Override
	public String checkRules(Composant composant)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getType() {
		return "Connector";
	}

}