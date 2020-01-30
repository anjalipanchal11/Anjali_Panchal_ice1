package cardgameweek4;
/**
 * Starter code for the Card class.
 * To be used in Week 4.
 * @author Anjali Panchal, 2020
 */
public class Card {
    
        public enum Suit {HEARTS, CLUBS,SPADES,DIAMONDS};
        public enum Value{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
        public enum Joker {JOKER};
        private final Suit suit;
        private final Value value;
        //private final Joker joker;
        //change made in repository
        public Card(Suit s, Value gVal)
        {
           suit =s;
           value= gVal;
        }
        
        public Value getValue() {
		return this.value;
	}

	
	public Suit getSuit() {
		return this.suit;
        }
        
}
