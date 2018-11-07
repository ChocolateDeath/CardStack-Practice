package lab4;
/**
 * 
 * Title: The Lab4App class
 * Description: This class applies the methods from the DiscardPile class.
 * 
 * @author Kevin Perez, Ronald Law
 *
 */
public class Lab4App {

	//@SuppressWarnings("unchecked")
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws StackFullException, StackEmptyException 
	{
		DiscardPile discardPile = new DiscardPile();
		
		discardPile.push(new Card(8));
		discardPile.push(new Card(32));
		discardPile.push(new Card(48));
		discardPile.push(new Card(2));
		discardPile.push(new Card(17));
		discardPile.push(new Card(20));
		discardPile.push(new Card(25));
		discardPile.push(new Card(50));
		discardPile.push(new Card(19));
		discardPile.push(new Card(41));

		//shows the stack
		System.out.println("Discard pile contents - "+discardPile.toString());
		//removes card from the stack
		System.out.println("Array contents: "+ printCArray(discardPile.removeTopCards(new Card(20))));
		System.out.println("Pile after removing card");
		System.out.println(discardPile.toString() +"Done.\n");
		
		
		//Emptying and re-populating the stack
		discardPile = new DiscardPile();
		discardPile.push(new Card(8));
		discardPile.push(new Card(32));
		discardPile.push(new Card(48));
		discardPile.push(new Card(2));
		discardPile.push(new Card(17));
		discardPile.push(new Card(20));
		discardPile.push(new Card(25));
		discardPile.push(new Card(50));
		discardPile.push(new Card(19));
		discardPile.push(new Card(41));
		
		System.out.println("Discard pile contents (second time) - "+discardPile.toString());
		System.out.println("Array contents (second time): "+ printCArray(discardPile.removeTopCards(new Card(50))));
		System.out.println("Pile after removing card (Second time)");
		System.out.println(discardPile.toString());
	}
	public static String printCArray(Card[] ca)
	{
		String s = "";
		for(int i = 0; i < ca.length; i++)
		{
			if(ca[i] != null)
				s = s + ca[i] +" ";
		}
		return s;
	}
}
