#include <iostream>

int main() {

    int a[5] = {5,1,3,4,1};
    int size = sizeof(a)/sizeof(a[0]); 

   for(int i = 1;i < size;i++) {
        int x = a[i];
        int j = i-1;
        while((j >= 0) && (a[j] > x)){
            a[j+1] = a[j];
            j = j -1;
        }
        a[j+1] = x;
    }


    for(int i = 0; i < size; i++) {
        std::cout << a[i] << std::endl;
    }
    return 0;
}

