def ana1(s1,s2):

    if len(s1) != len(s2):
        return "Not Anagram";
    
    if len(s1) < 2 and s1 != s2:
        return "Not Anagram";

    if sorted(s1) != sorted(s2):
        return "Not Anagram";

    return "Anagram";

def ana2(s1,s2):
    
    if len(s1) != len(s2):
        return "Not Anagram";
    
    if len(s1) < 2 and s1 != s2:
        return "Not Anagram";

    letters = [0] * 256;    

    for i in range(0,255):
        letters[int(s1[i])] += 1 
        letters[int(s2[i])] -= 1

    for i in range(0,255):
        if letters[i] != 0:
            return "Not Anagram"


print ana1("bba","aba")
print ana2("bba","aba")

