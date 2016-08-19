public class insertion {

   public static void printSorted(int array[],int size) {
      int j;      
      for(int i = 1; i < size; i++) {
         int x = array[i];
         j = i - 1;
         while(j >= 0 && array[j] > x) {
            
            array[j+1] = array[j];
            j = j - 1;
         }
         array[j+1] = x;
      }

      for(int i = 0; i < size; i++) {
         System.out.print(array[i]);
         System.out.print(" ");
         System.out.println();
      }
   }


   public static void main(String args[]) {
   
      int array[] = {1,10,8,2,3};
      int size = array.length;
      printSorted(array,size);
   
   }
}
