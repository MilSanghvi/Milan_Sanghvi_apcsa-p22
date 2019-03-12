package activity4;

import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private List<Card> cards = new ArrayList<Card>();
	//private Card[] cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;
	//private int origSize;

	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		
		
		//array version
		/*size = ranks.length * suits.length;
		origSize = size;
		//size of Card[]
		cards = new Card[size];*/
		
		//create each card
		//int pos = 0; //counts up to store each card in a slot in cards
		for(int i = 0; i < suits.length; i++)
		{
			for(int j = 0; j < ranks.length; j++)
			{
				//array version
				//cards[pos] = new Card(ranks[j], suits[i], values[j]);
				//pos++;
				//list version
				cards.add(new Card(ranks[j], suits[i], values[j]));
				
			}
		}
		
		size = cards.size();
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		//array version
		//if(size == 0) return true;
		
		//list version
		if(cards.size() == 0) return true;
		return false;	
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		//array version
		/*for(int i = size-1; i > 0; i--)
		{
			int r = (int)(Math.random()*(i+1));
			Card save = cards[i];
			cards[i] = cards[r];
			cards[r] = save;
		}
		//resetting value of size to the original size
		size = origSize;*/
		
		//list version
		
		  for(int i = cards.size()-1; i > 0; i--)
		  {
		  	int r = (int)(Math.random()*(i+1));
		  	Card save = cards.get(i);
		  	cards.set(i, cards.get(r));
		  	cards.set(r, save);
		  }
		 
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		//array version
		/*if(size > 0) size--;
		else return null;
		return cards[size];*/
		
		//list version
		if(cards.size() > 0)
		{
			Card d = cards.get(cards.size()-1);
			size--;
			return d;
		}
		else return null;
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		//array version
		/*for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards[k];
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}
		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.length - 1; k >= size; k--) {
			rtn = rtn + cards[k];
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.length) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}*/
		
		//list version
		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - size) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}
		
		rtn = rtn + "\n";
		return rtn;
	}
}