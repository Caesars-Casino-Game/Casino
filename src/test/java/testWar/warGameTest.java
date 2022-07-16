package testWar;

import com.github.zipcodewilmington.casino.games.card.Card;
import com.github.zipcodewilmington.casino.games.card.deck.Deck;
import com.github.zipcodewilmington.casino.games.war.WarGame;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class warGameTest {
    @Test
    public void makeWarDeckTest () {
        //given
        int x = 52;
        WarGame warGame = new WarGame();
        //when
        ArrayList<Card> cards = warGame.makeWarDeck();
        int actual = cards.size();
        //then
        Assert.assertTrue(x==actual);
    }

    @Test
    public void splitDeckTest () {
        //given
        int x = 26;
        WarGame warGame = new WarGame();
        ArrayDeque<Card> d = warGame.readyToUseWarDeck();
        //when
        warGame.splitDeck(d);
        int actual = warGame.dealerHand.size();
        //then
        Assert.assertEquals(x,actual);
    }

    @Test
    public void addThreeCardsToFieldTest () {
        //given
        int x = 3;
        WarGame warGame = new WarGame();
        ArrayDeque<Card> d = warGame.readyToUseWarDeck();
        //when
        warGame.addThreeCardsToField(d);
        int actual = warGame.fieldDeck.size();
        //then
        Assert.assertEquals(x,actual);
    }

    @Test
    public void collectCardsInFieldTest () {
        //given
        int x = 0;
        WarGame warGame = new WarGame();
        ArrayDeque<Card> d = warGame.readyToUseWarDeck();
        //when
        warGame.collectCardsInField(d);
        int actual = warGame.fieldDeck.size();
        //then
        Assert.assertEquals(x,actual);
    }

    @Test
    public void compareValueAndAddTest () {
        //given
        WarGame warGame = new WarGame();
        ArrayDeque<Card> dealerHand = warGame.readyToUseWarDeck();
        ArrayDeque<Card> playerHand = warGame.readyToUseWarDeck();
        int x = 0;
        Card playerCard = playerHand.removeFirst();
        Card dealerCard = dealerHand.removeFirst();
        //when
        warGame.compareValueAndAdd(playerCard,dealerCard);
        int actual = warGame.fieldDeck.size();
        //then
        Assert.assertEquals(x,actual);
//        Assert.assertTrue(playerCard==dealerCard);
    }



}
