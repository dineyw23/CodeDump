class compress 
{
   public static void main(String args[])
   {
      String s = args[0];
      System.out.println(compress(s));
      
   }

   public static String compress(String s)
   {
      int finalLength = compressLength(s);
      if(finalLength >= s.length()) return s;

      StringBuilder ans = new StringBuilder(finalLength);
      int count = 0;
      for(int i = 0;i < s.length();i++)
      {
         count++;
         if(i+1 >= s.length() || s.charAt(i) != s.charAt(i+1))
         {
            ans.append(s.charAt(i));
            ans.append(count);
            count = 0;
         }
      }
      
      return ans.toString();
   }

   public static int compressLength(String s)
   {
      int count = 0;
      int returnValue = 0;
      for(int i = 0;i < s.length();i++)
      {
         count++;
         if(i+1 >= s.length() || s.charAt(i) != s.charAt(i+1))
         {
            returnValue += 1 + String.valueOf(count).length();
            count = 0;
         }
      }
      return returnValue;

   }

}
