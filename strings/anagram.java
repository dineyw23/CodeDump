
class anagram 
{
   public static void main(String args[])
   {
      String a = "cinema";
      String b = "iceman";
      anagram Obj = new anagram();
      System.out.println(Obj.anagram1(a,b));
      System.out.println(Obj.anagram2(a,b));
   }

   public String sort(String s)
   {
      char[] array = s.toCharArray();
      java.util.Arrays.sort(array);
      return new String(array);
   }  
   public boolean anagram1(String a, String b)
   {
      if(a.length() != b.length())
         return false;

      return sort(a).equals(sort(b));

   }

   public boolean anagram2(String a,String b) 
   {
      int[] array = new int[256];

      int len = a.length();
      if(len != b.length())
         return false;
      
      for(int i = 0; i < len; i++)
      {
         array[a.charAt(i)]++;
         array[b.charAt(i)]--;
      }

      for(int i = 0; i < 256; i++)
         if(array[i] != 0)
            return false;
      return true;
   }

}
