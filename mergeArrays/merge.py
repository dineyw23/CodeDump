a = [1,2,8,9]
b = [3,4,5,6,7]

## When you just want to do stuff
print("Used sorted function directly: ",sorted(a + b))

## When you want to learn
result = []
while a and b:
   if a[0] < b[0]:
      result.append(a.pop(0))
   else:
      result.append(b.pop(0))

print ("Merged and Sorted manually: ",result + a + b)
