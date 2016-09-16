class manip 
{
   static boolean setBit(int num, int i)
   {
      return ((num & (1 << i)) != 0);
   }

   public static void main(String args[])
   {
      System.out.println(setBit(4,4));
   }

}
