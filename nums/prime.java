class prime
{
   prime() {};

   static boolean isPrime(int x)
   {  
      if(x < 2)
         return false;

      int sqrt = (int)Math.sqrt(x);
      for(int i = 2;i <= sqrt;i++)
      {
         if((x % i) == 0)
            return false;
      }
      return true;
   }
   
   public static void main(String args[])
   {  
      System.out.println(isPrime(11));
      System.out.println(isPrime(16));
      System.out.println(isPrime(1));
   }


}
