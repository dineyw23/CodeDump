class mergeSorted
{
   static void mergeSortedArray(int[] a,int[] b,int lenA,int lenB)
   {
     int indexA = lenA - 1;
     int indexB = lenB - 1;
     int total = lenA + lenB - 1;

     while(indexB >= 0)
     {
         if(indexA >= 0 && a[indexA] > b[indexB])
         {  
            a[total] = a[indexA];
            indexA--;
         }
         else
         {
            a[total] = b[indexB];
            indexB--;
         }
         total--;
     }
   }

   public static void main(String args[])
   {
      int a[] = new int[6];
      int b[] = new int[3];
      
      a[0] = 0;
      a[1] = 13;
      a[2] = 14;

      b[0] = 12;
      b[1] = 13;
      b[2] = 16;
      mergeSortedArray(a,b,3,3);
      for(int i = 0;i < a.length;i++)
      {
         System.out.println(a[i]);
      }
   }
}
