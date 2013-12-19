package factoryfun.donnees;

import java.util.ArrayList;

public class Tuyau extends Composant
{

	public static final int LEFT = 1;
	public static final int RIGHT = 2;
	public static final int TOP = 3;
	public static final int BOTTOM = 4;
	
	private ArrayList<Integer> inputs;
	private String img;
	
	private Tuyau(int input, String img)
	{
		inputs = new ArrayList<Integer>();
		inputs.add(input);
		
		this.img = img;
	}
	
	private Tuyau(int input_1, int input_2, String img)
	{
		inputs = new ArrayList<Integer>();
		inputs.add(input_1);
		inputs.add(input_2);
		
		this.img = img;
	}
	
	private Tuyau(int input_1, int input_2, int input_3, String img)
	{
		inputs = new ArrayList<Integer>();
		inputs.add(input_1);
		inputs.add(input_2);
		inputs.add(input_3);
		
		this.img = img;
	}
	
	private static Tuyau createCompleteTuyau(String img)
	{
		Tuyau t = new Tuyau(LEFT, img);
		
		t.addTuyau(LEFT);
		t.addTuyau(RIGHT);
		t.addTuyau(TOP);
		t.addTuyau(BOTTOM);
		
		return t;
	}

	public static Tuyau createCrossTuyau()
	{
		return createCompleteTuyau("+");
	}
	
	public static Tuyau createLTuyau()
	{
		return new Tuyau(TOP, RIGHT, "L");
	}
	
	public static Tuyau createITuyau()
	{
		return new Tuyau(TOP, BOTTOM, "I");
	}
	
	public static Tuyau createDashTuyau()
	{
		return new Tuyau(LEFT, RIGHT, "-");
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

}