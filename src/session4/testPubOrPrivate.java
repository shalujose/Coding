package session4;

public class testPubOrPrivate {

	public static void main(String[] args) {
		
		PubOrPrivate pr=new PubOrPrivate();
		pr.title="Programming in C";
		pr.setPrice(300);
		pr.authorName="Balaguruswami";
		
		//pr.setval(pr.price);
		System.out.println("Title : "+pr.title+" Price : "+pr.getPrice()+"  AuthorName: "+pr.authorName);
		PubOrPrivate book1=new PubOrPrivate("Java2",500,"Albert");
		System.out.println(book1.toString());
		PubOrPrivate book2=new PubOrPrivate("Java2",500,"Albert");
		System.out.println(book2);
		
	}
	
	

}
