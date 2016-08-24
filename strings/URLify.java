class URLify 
{
   public static void main(String args[])
   {
      String temp =  "Hello there";
      char[] str = temp.toCharArray();
      int len = str.length;
      System.out.println(len);
      URLify Obj = new URLify();
      Obj.replace(str,len);

   }

   public void replace(char[] str, int len)
   {
      int count = 0,index,i = 0;
      // Pass 1
      for(i = 0; i < len;i++)
      {
         if(str[i] == ' ')
            count++;
      }

      index = len + count * 2;
      
      if(len < (str.length+2))
         str[len] = '\0';

      for(i = len - 1; i >= 0; i--)
      {
         if(str[i] == ' ')
         {
            str[index - 1] = '0';
            str[index - 2] = '2';
            str[index - 3] = '%';
            index -= 3;
         }
         else 
         {
            str[index - 1] = str[i];
            index--;
         }
      }

      for(i = 0; i < len;i++)
         System.out.print(str);
   }
}
