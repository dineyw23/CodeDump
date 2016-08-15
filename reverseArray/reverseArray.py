array = [int(x) for x in input("Please enter Array: ").split()]

## Hard Way
i = len(array) - 1
j = 0
while(j < i):
   temp = array[i]
   array[i] = array[j]
   array[j] = temp
   i -= 1
   j += 1
print ('Hard Way: ',array)

## Python way
array.reverse()
print ('Python way: ',array)
