package day21;

public class Audi  extends Car{
	String model;
	public void accelerate()
	{
		System.out.println("car acceleration");
	}
	public static void main(String[] args) {
		Audi a=new Audi();
		a.model="Audi";
		a.accelerate();
		a.start();
		a.price=1111;
		
	}

}
