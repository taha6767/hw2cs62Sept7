package flippy;

/**
 * Keeps track of the cards and and answers questions
 * for the flippy card game. 
 * 
 * Red cards (hearts and diamonds) award positive points, while black cards 
 * (clubs and spades) award negative points.  Cards 2-10 have points worth 
 * their face value, Jack, Queen and King 10 and Ace 11.
 * 
 * @author Taha
 *
 */
public class FlippyCards {
	private Card[] cards; // the cards for the game

	/**
	 * Create a new flippy card game state, which consists of the
	 * numCards cards for the game.
	 * 
	 * @param numCards number of cards in the game
	 */
	public FlippyCards(int numCards){
		this.cards = new Card[numCards];
		CardDealer dealer = new CardDealer(2);
		for(int i=0; i<numCards;i++){
			this.cards[i]=dealer.next();
		}
	}

	/**
	 * Returns the flippy card at the given index 
	 * 
	 * @return the flippy card at the given index
	 */
	public Card getCard(int index) {
		return cards[index];
	}
	
	/**
	 * Flip the card over at this index.  Card indices
	 * start at 0 and go up the cards.length-1
	 * 
	 * @param cardIndex the index of the card to flip over
	 */
	public void flipCard(int cardIndex) {
		this.cards[cardIndex].flip();
	}

	/**
	 * Calculate the best possible score for the
	 * current cards.
	 * 
	 * @return the optimal score
	 */
	public int calculateOptimalScore(){
		//TODO: Fill in good stuff here!
		return 0;
	}


	/**
	 * Calculate the flippy card score for the cards that are
	 * face up.  
	 * 
	 * @return the flippy card score for faceup cards
	 */
	public int faceUpTotal(){
		int score =0;
		for(int i=0; i<cards.length;i++){
			if(cards[i].isFaceUp()){
				score += cards[i].getFlippyCardValue();
			}
			
		}
		return score;
	}

	/**
	 * Calculate the flippy card score for the cards that are
	 * face down.  
	 * 
	 * @return the flippy card score for facedown cards
	 */
	public int faceDownTotal(){
		int score =0;
		for(int i=0; i<cards.length;i++){
			if(!cards[i].isFaceUp()){
				score += cards[i].getFlippyCardValue();
			}
			
		}
		return score;
	}


	//TODO: Add a toString method here!
	public static void main(String[] args){
		int cardsTotal =4;
		FlippyCards game1 = new FlippyCards(cardsTotal);
		for(int i=0;i<cardsTotal;i++){
		System.out.println(game1.getCard(i).getFlippyCardValue());
		System.out.println(game1.getCard(i).getSuit());
		System.out.println(game1.getCard(i).getNumber());
			
		}
	}
}
