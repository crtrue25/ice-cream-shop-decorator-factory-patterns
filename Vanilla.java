

public class Vanilla extends FlavorDecorator 
{

	public Vanilla(MenuItem item) 
	{
		super(item);
		this.price = 1.0f;
		this.description = "Vanilla";
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

