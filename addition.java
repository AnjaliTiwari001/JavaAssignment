package polymorphismRuntimeOverloading;

public class addition {
	int num1;
	int num2;
	
	public int add() {
		return num1+num2;
		
	}
	
	public int add(int a, int b){
		return a+b;
	}
	
	
	public int add(int a, int b, int c)
	{
		return a+b+c;
	}
	
	
	public float add (float d,float e)
	{
		return d+e;
	}
	
	public float add (float f,float g, float h)
	{
		return f+g+h;
	}
}
