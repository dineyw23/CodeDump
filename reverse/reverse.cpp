#include<iostream>
#include<string>

std::string reverse(std::string input)
{
  char array[50];
  strcpy(array,input.c_str());
  const size_t length = strlen(array);
  for(size_t i = 0; i < length/2; i++)
   std::swap(array[i],array[length-i-1]);
  std::string output(array);  
  return output;
}

int main()
{
  std::string input;
  std::cout << "Please enter the string to be reversed: ";
  std::getline(std::cin,input);
  std::string result;
  result = reverse(input);
  std::cout << "Reversed String: " <<  result << std::endl;  
  return 0;
}



