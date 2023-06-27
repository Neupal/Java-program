interface AnimalEat
{
	public void Eat();
}
interface AnimalTravel
{
	public void Travel();
}
class Animal implements AnimalEat,AnimalTravel
{
	public void Eat()
	{
		System.out.println("Animal is eating");
	}
	public void Travel()
	{
		System.out.println("Animal is travelling");
	}
	
	public static void main(String[] args) 
	{
		Animal a=new Animal();
		a.Eat();
		a.Travel();
	}
}
