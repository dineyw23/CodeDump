#include <iostream>

int main()
{
   int a[10];
   std::cout << "Enter input array: " << std::endl;
   for(int i = 0; i < 10; i++)
      std::cin >> a[i];  
   int len = sizeof(a)/sizeof(*a);
   int i = len - 1;
   int j = 0;

   while(j < i)
   {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
      i--;
      j++;
   }

   std::cout << "Reversed Array: ";
   for(int i = 0; i < 10;i++)
      std::cout << a[i] <<  " ";
   std::cout << std::endl;

   return 0;
}
