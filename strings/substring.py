text = "There's a Pokemon in my apartment."
find = "in my"

start = text.find(find)
end = start + len(find) - 1

print ("Start: ", start)
print ("End: ", end)
print ("Substring: ",text[start:end])

##

print(find in text)
