public class MintChocolateChip extends FlavorDecorator 
{

	public MintChocolateChip(MenuItem item) 
	{
		super(item);
		this.price = 1.0f;
		this.description = "Mint-Chocolate-Chip";
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