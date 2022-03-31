
public abstract class MenuItem 
{
	protected float price;
	protected String description;
	
	public MenuItem() 
	{
		price = 0;
		description = null;
	}

	public MenuItem(float price, String desc)
	{
		this.price = price;
		this.description = desc;
	}
	
	public abstract float getCost();
	
	public String getDescription()
	{
		return this.description;
	}
	
	public int countLayers()
	{
		return 1;
	}
	
	public void buildCostArray(float[] prices, int layer)
	{
		prices[layer] = this.price;
	}
}
