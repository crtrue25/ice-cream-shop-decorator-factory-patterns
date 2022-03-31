
public class Strawberry extends FlavorDecorator 
{

	public Strawberry(MenuItem item) 
	{
		super(item);
		this.price = 1.0f;
		this.description = "Strawberry";
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
