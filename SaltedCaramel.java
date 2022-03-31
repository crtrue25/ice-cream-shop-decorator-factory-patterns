public class SaltedCaramel extends FlavorDecorator 
{

	public SaltedCaramel(MenuItem item) 
	{
		super(item);
		this.price = 1.0f;
		this.description = "Salted-Caramel";
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