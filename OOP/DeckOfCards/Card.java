public abstract class Card
{
   private boolean avail = true;

   protected int value;
   protected Suit suit;

   public Card(int v,Suit s)
   {
      value = v;
      suit = s;
   }

   public abstract int getValue();

   public Suit getSuit()
   {
      return suit;
   }

   //Availability
   
   public boolean isAvailable()
   {
      return avail;
   }
   public void setAvailable()
   {
      avail = true;
   }
   public void setUnavailable()
   {
      avail = false;
   }
}
