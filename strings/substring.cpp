#include <iostream>

int main(){
   
   std::string text = "My name is Pikachu.";
   std::string find = "Pikachu";

   char textArray[100];
   char findArray[100];
   
   strcpy(textArray,text.c_str());
   strcpy(findArray,find.c_str());
   
   const size_t len = strlen(textArray);
   const size_t lenStr = strlen(findArray);
   bool flag = false;
   int pos;
   int j = 0;
   for(size_t i = 0; i < len - 1; i++){
      if(textArray[i] == findArray[0]){
         pos = i;
         for(j = 0; j < lenStr; j++){
            if(textArray[i] != findArray[j])
               break;
            else {
               i++;
            }
         }
         if(lenStr == j){
            flag = true;
         }
      }
   }
   if(flag == true)
      std::cout << "Substring present at" << pos << std::endl;

   // Simple method to find substring.
   size_t found = text.find(find);
   if(found != std::string::npos)
      std::cout << "Substring present at " << found << std::endl;
   
   return 0;
}

