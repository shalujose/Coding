package session4;
public class PubOrPrivate {
	
	public String title;
	// variable declared as public that accessible in the whole class
	private int price;
	public String authorName;
	
	//assign values
	

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price<0)
		{
			throw new IllegalArgumentException("price not be Negative");
		}
		this.price = price;
	}
	
	//Constructor
	PubOrPrivate()
	{
		System.out.println("This is a default constructor");
	}
	
	PubOrPrivate(String title,int price,String authorName)
	{
		this.title=title;
		this.price=price;
		this.authorName=authorName;
		System.out.println("This is the parameterised constructor");
	}
	public String string()
	{
		return "[title:" + this.title + ", price: "+ price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PubOrPrivate other = (PubOrPrivate) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	

}
