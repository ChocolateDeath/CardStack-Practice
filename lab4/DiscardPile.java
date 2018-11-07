package lab4;

/**
 * 
 * Title: The discardPile class
 * 
 * Description: Stack containing the Cards and uses methods from the Stack class.
 * 
 * @author Kevin Perez, Ronald Law
 *
 */
public class DiscardPile extends Stack{

	private int size;

	public DiscardPile()
	{
		super(52);
	}

	public Card[] removeTopCards(Card theCard) throws StackEmptyException
	{
		Card[] c = new Card[getSize()];
		int n = 0;
		boolean notFound = true;
		
		try{
			while(notFound && !isEmpty())
			{	
				//System.out.println("Peek: "+peek()+" theCard: "+theCard);
				Card compare = (Card) peek();
				if(!compare.equals(theCard))
				{
					c[n] = (Card) pop();
					n++;
				}
				else if(compare.equals(theCard)){
					c[n]= (Card) pop();
					notFound = false;
				}
				//return c;
				//System.out.print(n);
			}
			
		} catch(StackEmptyException em){
			if(n==0 && isEmpty())
				System.out.println(em.getMessage());
			if(n!=0 && notFound)
				System.out.println("Card not found!");
		}
		
		//if(isEmpty())
		//	throw new StackEmptyException();
		//else if(!found)
		//	throw new StackEmptyException("Card Not Found");
		return c;
	}	
}

