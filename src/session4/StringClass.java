package session4;

public class StringClass {
	
	public static void main(String [] args)
	{
		PubOrPrivate book1=new PubOrPrivate("C",150,"Bala");
		PubOrPrivate book2=new PubOrPrivate("C",150,"Bala");
		PubOrPrivate book3=book1;
		
		System.out.println("HashCode=>book1: " +book1.hashCode() + " book2: "+ book2.hashCode() + " book3 : "+ book3.hashCode());
		System.out.println("Is book1 equal book2) "+ (book1==book2));
		System.out.println("Is book1.equals(book2) " + book1.equals(book2));
		
		System.out.println("HashCode=>book1:" +book1.hashCode() + " book3: "+ book2.hashCode() + " book3 : "+ book3.hashCode());
		System.out.println("Is book1 equal book3) "+ (book1==book3));
		System.out.println("Is book1.equals(book3) " +book1.equals(book3));
		
	}

	@Override
	public String toString() {
		
		StringBuilder content=new StringBuilder();
		content.append("[");
		//content.append("title:").appeend(this.title).append(",");
		
		
		return content.toString();
	}
	
	

}
