import java.util.ArrayList;

public class IceCreamFactory 
{
	public IceCreamFactory() 
	{
		
	}

	public MenuItem getOrder(int type, ArrayList<Integer> flavors)
	{
		MenuItem order = null;
		
		switch(type)
		{
		case 1:
			order = new Bowl();
			break;
		case 2:
			order = new CakeCone();
			break;
		case 3:
			order = new WaffleCone();
			break;
		}
		
		for(int flavor : flavors)
		{
			switch(flavor)
			{
			case 1:
				order = new Chocolate(order);
				break;
			case 2:
				order = new Vanilla(order);
				break;
			case 3:
				order = new Strawberry(order);
				break;
			case 4:
				order = new Neapolitan(order);
				break;
			case 5:
				order = new ChocolateChip(order);
				break;
			case 6:
				order = new ButterPecan(order);
				break;
			case 7:
				order = new BlackRaspberryChocolateChip(order);
				break;
			case 8:
				order = new ChocolateChipCookieDough(order);
				break;
			case 9:
				order = new CookiesNCream(order);
				break;
			case 10:
				order = new MintChocolateChip(order);
				break;
			case 11:
				order = new Butterscotch(order);
				break;
			case 12:
				order = new RockyRoad(order);
				break;
			case 13:
				order = new SaltedCaramel(order);
				break;
			}
		}
		
		return order;
	}
}
