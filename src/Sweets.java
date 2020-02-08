package newyeargift.gift;

public class Sweets implements Comparable<Sweets>
{
	private int weight;
	private int price;
	public Sweets(int weight, int price) {
		super();
		this.weight = weight;
		this.price = price;
	}
	public int getWeight() {
		return weight;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
		@Override
	public String toString() {
		return "Sweets [weight=" + weight + "]";
	}
	public int compareTo(Sweets arg0) {
			if(this.getWeight()>arg0.getWeight())
				return 1;
			else
				return -1;
			//return 0;
		}
		
	

}
