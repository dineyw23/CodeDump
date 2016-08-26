class repSequence 
{
   public static void main(String args[])
   {
      if(args.length == 2)
      {   
         String s1 = args[0];
         String s2 = args[1];
         System.out.println(repSequence(s1,s2));
      }
      else
      {
         System.out.println("Pass two strings as args");
      }
   }

   static boolean repSequence(String s1, String s2)
   {
      if(s1.length() > 0 && s1.length() == s2.length())
      {
         String s1s1 = s1 + s1;
         return isSubstring(s1s1,s2);
      }
      return false;
   }

   static boolean isSubstring(String s1, String s2)
   {
      if(s1.indexOf(s2) != -1)
         return true;
      return false;
   }
}
