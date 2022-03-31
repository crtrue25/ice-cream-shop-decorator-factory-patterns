public class CookiesNCream extends FlavorDecorator 
{

	public CookiesNCream(MenuItem item) 
	{
		super(item);
		this.price = 1.0f;
		this.description = "Cookies-'n-Cream";
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