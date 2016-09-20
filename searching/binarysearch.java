class binarysearch
{
   static int binarySearch(int[] array, int x)
   {
      int high = array.length;
      if(high == 0)
         return 0;
   
      int low = 0;
      int mid = (low + high) / 2;

      while(low <= high)
      {
         if(x > array[mid])
            low = mid + 1;
         else if(x < array[mid])
            high = mid - 1;
         else 
            return mid;
      }
      return -1;
   }
   
   static int binarySearch(int[] array,int x,int low,int high)
   {
      int mid = (low + high) / 2;
      if(high < low)
         return -1;
      if(x > array[mid])
         return binarySearch(array,x,mid + 1,high);
      else if(x < array[mid])      
         return binarySearch(array,x,low,mid - 1);
      else 
         return mid;
   }

   public static void main(String args[])
   {
      int a[];
      a = new int[5];
      a[0] = 1;
      a[1] = 121;
      a[2] = 0;
      a[3] = 121;
      a[4] = 12;
      
      System.out.println(binarySearch(a,0));
      System.out.println(binarySearch(a,121,0,4));
   }

}
