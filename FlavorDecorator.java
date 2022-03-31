
public abstract class FlavorDecorator extends MenuItem
{
	protected MenuItem wrappedObject;
	
	public FlavorDecorator(MenuItem item) 
	{
		this.wrappedObject = item;
	}
	
	@Override
	public int countLayers()
	{
		return 1 + this.wrappedObject.countLayers();
	}
	
	@Override
	public void buildCostArray(float[] prices, int layer)
	{
		prices[layer] = price;
		wrappedObject.buildCostArray(prices, layer+1);
	}

}
