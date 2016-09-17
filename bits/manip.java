class manip 
{
   static boolean setBit(int num, int i)
   {
      return ((num & (1 << i)) != 0);
   }

   static int numberManip(int m,int n,int i, int j)
   {
      int ones = ~0;
      
      int l = (ones << j) - 1;
      int r = (( 1 << i) - 1);

      int mask = l | r;

      int nClear = n & mask;
      int mClear = m << i;

      return nClear | mClear;
   
   }
   
   static String toString(int x)
   {
      StringBuilder result = new StringBuilder();
         
      while(x > 0)
      {
         int i = x % 2;
         x = x >> 1;
         result.append(i);
         
      }
      return result.reverse().toString();
   }

   static String toString(double x)
   {
      if(x >= 1 || x <= 0)
         return "ERROR!";
      
      StringBuilder result = new StringBuilder();
      result.append(".");
      while(x > 0)
      {
         if(result.length() >= 32)
            return "ERROR!";

         double r = x * 2;
         if(r >= 1)
         {
            result.append(1);
            x = r - 1;
         }
         else
         {
            result.append(0);
            x = r;
         }
      }
      return result.toString();
   }

   static int numOfDiff(int x, int y)
   {  
      if(x == y)
         return 0;
      int count = 0;
      for(int a = x ^ y; a != 0; a = a >> 1)
         count = count + (a & 1);

      return count;

   }

   static int swapOddEven(int x)
   {
      return ((x &  0xAAAAAAAA) >>> 1) | ((x & 0x55555555) << 1);
   }
   
   public static void main(String args[])
   {
      System.out.println(setBit(4,4));
      System.out.println(Integer.toBinaryString(numberManip(19,1024,2,6)));
      System.out.println(toString(1));
      System.out.println(toString(0.5));
      System.out.println(numOfDiff(2,3));
      System.out.println(swapOddEven(23));
   }


}
