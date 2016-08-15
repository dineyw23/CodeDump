#include <iostream>

int main()
{
   int a[4] = {1,2,8,9};
   int b[5] = {3,4,5,6,7};
   
   int i,j,k;
   i = 0;
   j = 0;
   k = 0;
   int result[9];

   while (i < 4 && j < 5){
      if (a[i] <= b[j]){
         result[k] = a[i];
         i++;
      }
      else{
         result[k] = b[j];
         j++;
      }
      k++;
   }

   if(i < 4){
      for(int p = i; p < 4; p++){
         result[k] = a[p];
         k++;
      }
   }
   else{
       for(int p = j; p < 5; p++){
         result[k] = a[p];
         k++;
      }
   }

   for(int z = 0; z < 9; z++)
      std::cout << result[z] << " ";
   std::cout << std::endl;
   return 0;
}
