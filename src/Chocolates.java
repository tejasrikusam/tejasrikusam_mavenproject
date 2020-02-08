package newyeargift.gift;

public class Chocolates implements Comparable<Chocolates>
{
	private int weight;
	private int price;
	
	public Chocolates(int weight, int price) {
		super();
		this.weight = weight;
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int compareTo(Chocolates o) {
		// TODO Auto-generated method stub
		if(this.getWeight()>o.getWeight())
			return 1;
		else
			return -1;
		
	}
	

}
