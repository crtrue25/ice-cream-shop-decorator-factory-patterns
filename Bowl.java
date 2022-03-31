
public class Bowl extends MenuItem
{
	public Bowl() 
	{
		super(5f, "Bowl");
	}

	@Override
	public float getCost()
	{
		return this.price;
	}
}
