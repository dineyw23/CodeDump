#include <iostream>
#include <set>
#include <stdlib.h>

void reDups(int a[],int size) {
   int *count = new int[size-2];
   for(int i = 0; i < size;i++) 
   {
      if(count[a[i]] == 1)
         std::cout << a[i] << " " ;
      else 
         count[a[i]]++;
   }
   std::cout << std::endl;
}

/*void reDups2(int a[],int size) 
{
   for(int i = 0; i < size; i++)
   {
      if(a[abs[a[i]]] > 0)
         a[abs[a[i]]] = -a[abs[a[i]]];
      else
         std::cout << abs[a[i]] << " ";
   }
}
*/
int main () {

    int a[5] = {18,2,2,3,18};
/*    std::set<int> myset;
    int b[5];
    int dups[5];
    for(int i = 0; i < 5; ++i){
        if(myset.find(a[i]) != myset.end()){
            b[i] = a[i];
            myset.insert(a[i]);
        }
        else {
           dups[i] = a[i]; 
        }
    }
    if(myset.size() == 4)
        std::cout << "Dups found!" << std::endl;
    
    int x = sizeof(dups)/sizeof(dups[0]);
    for(int i = 0; i < x;i++){
        std::cout << dups[x] << " ";
    }*/

    int arrSize = sizeof(a)/sizeof(a[0]);
    reDups2(a,arrSize);
    return 0;
}
