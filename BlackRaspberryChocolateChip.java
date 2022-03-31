
public class BlackRaspberryChocolateChip extends FlavorDecorator 
{

	public BlackRaspberryChocolateChip(MenuItem item) 
	{
		super(item);
		this.price = 1.0f;
		this.description = "Black-Raspberry-Chocolate-Chip";
	}
	
	@Override
	public float getCost()
	{
		return this.price + this.wrappedObject.getCost();
	}
	
	@Override
	public String getDescription()
	{
		return this.description + " " + this.wrappedObject.getDescription();
	}
}