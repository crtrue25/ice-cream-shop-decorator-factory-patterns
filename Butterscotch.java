public class Butterscotch extends FlavorDecorator 
{

	public Butterscotch(MenuItem item) 
	{
		super(item);
		this.price = 1.0f;
		this.description = "Butterscotch";
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