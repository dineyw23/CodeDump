#include <iostream>
#include <string>


std::string anagram1(std::string s1, std::string s2){
    
    std::string positive = "Anagram";
    std::string negative = "Not Anagram";
 
    if(s1.length() != s2.length())
        return negative;
    
    if(s1.length() < 2 && s1 != s2)    
      return negative;

    std::sort(s1.begin(),s1.end());
    std::sort(s2.begin(),s2.end());

    if(s1 != s2)
        return negative;
    
    return positive;
}

std::string anagram2(std::string s1, std::string s2) {

    std::string positive = "Anagram";
    std::string negative = "Not Anagram";

    if(s1.length() != s2.length())
        return negative;
    
   if(s1.length() < 2 && s1 != s2)    
      return negative;


    int letters[256];    
    
    for(int i = 0; i < 256; i++) {
         letters[i] = 0;
    }

    for(int i = 0; i < s1.length(); i++) {
        letters[s1[i]]++;
        letters[s2[i]]--;
    }

    for(int i = 0; i < 256; i++) {
        if(letters[i] != 0) {
            return negative;
        }
    }
    return positive;
}

int main () {
    std::string s1 = "iceman";
    std::string s2 = "cinema";
    
    std::cout << "Method 1: "  << anagram1(s1,s2) << std::endl;
    std::cout << "Method 2: " << anagram2(s1,s2) << std::endl;
    
    return 0;
}
