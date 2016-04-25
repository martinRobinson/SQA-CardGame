package ie.lyit.comp.cardgame;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class deckTest {
	deck testDeck;
	
	@Before
	public void setUp() throws Exception {
		testDeck = new deck();
	}

	@Test
	public void test() {
		assertEquals(52, testDeck.getCardCount());
	}

	@Test
	public void testDrawKnownCard() {
		card testCard = testDeck.drawNextCard();
		String result = testCard.toString();
		System.out.println(result);
		assertEquals(result, "card [suite=CLUBS, rank=KING]");
	}
}