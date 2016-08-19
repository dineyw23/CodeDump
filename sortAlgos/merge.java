public class merge {

   public static void main(String[] args) {
      
      int[] array = {2,3,14,5,1};
      int size = array.length;

      merge MergeObj = new merge();
      mergeObj.sort(array,size);
   }

   public void sort(array,size) {

      doMergeSort(0,size-1);
   }

   public void doMergeSort(int low,int high) {
   
      if(low < high) {
      
         int middle = low + (high - low) / 2;
         doMergeSort(low,middle);
         doMergeSort(middle + 1, high);
         merge(low,middle,high);    
      
      }
   }


}
