
public class RockyRoad extends FlavorDecorator 
{

	public RockyRoad(MenuItem item) 
	{
		super(item);
		this.price = 1.0f;
		this.description = "Rocky-Road";
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