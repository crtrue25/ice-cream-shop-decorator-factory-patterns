
public class CakeCone extends MenuItem
{
	public CakeCone() 
	{
		super(6f, "Cake-Cone");
	}
	
	@Override
	public float getCost()
	{
		return this.price;
	}
}
