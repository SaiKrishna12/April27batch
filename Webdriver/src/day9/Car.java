package day9;

public class Car {

	int price;
	String model;
	static int wheels;
	public static void start()
	{
		System.out.println("This is to start the car");
	}
	public void accelerate()
	{
		System.out.println("car acceleration process");
	}
	public static void main(String[] args) {
		Car c1=new Car();
		c1.price=1111;
		c1.model="Audi";
		c1.wheels=4;
		
		Car c2=new Car();
		c2.price=2222;
		c2.model="BMW";
		c2.wheels=6;
		
		Car c3=new Car();
		c3.price=3333;
		c3.model="RR";
		c3.wheels=4;
		
		c1=c2;
		//now c1 starts pointing to the memory location of c2
		//and the data present in the original memory location
		//of c1 is lost
		c2=c3;
		//now c2 starts pointing to the memory location of c3
		//but the data present in the original memory location
		//of c2 is not lost as c1 is still pointing to it
		
	}

}
