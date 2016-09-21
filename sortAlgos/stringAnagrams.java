import java.util.*;

class stringAnagrams
{
   static String[] stringAnagrams(String[] a)
   {
      
      HashMap<String,ArrayList<String>> list = new HashMap<String,ArrayList<String>>();

      for(String s: a)
      {
         String x = sortString(s);
         if(!list.containsKey(x))
            list.put(x,new ArrayList<String>());
         list.get(x).add(s);
      }

      int index = 0;
      for(String key: list.keySet())
      {
         ArrayList<String> l = list.get(key);
         for(String i : l)
         {
            a[index] = i;
            index++;
         }
      }
      return a;
   }

   static String sortString(String s)
   {
      char[] cArray = s.toCharArray();
      Arrays.sort(cArray);
      return new String(cArray);
   }

   public static void main(String args[])
   {
      String[] array;
      array = new String[5];

      array[0] = "boy";
      array[1] = "hello";
      array[2] = "byo";
      array[3] = "elloh";
      array[4] = "oyb";
   
      stringAnagrams(array);
      
      for(String s: array)
         System.out.println(s);

   }
}
