import java.util.ArrayList;

public class Deck <T extends Card> 
{
   private ArrayList<T> cards;
   private int dealtIndex = 0;

   public void setDeck(ArrayList<T> deck)
   {  }

   public void shuffle()
   {
   }
   public int remainingCards()
   {
      return cards.size() - dealtIndex;
   }
   public T dealCard()
   {
   }
   public T[] dealHand()
   {
   }
}



