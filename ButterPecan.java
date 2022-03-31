
public class ButterPecan extends FlavorDecorator 
{

	public ButterPecan(MenuItem item) 
	{
		super(item);
		this.price = 1.0f;
		this.description = "Butter-Pecan";
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