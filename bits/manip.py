def getBit(num,i):
   print bin(1 << i)
   print bin(num)
   print (num & (1 << i))
   print bin(num & (1 << i))
   return ((num & (1 << i)) != 0)


def setBit(num,i):
   print bin(1 << 1)
   print bin(num)
   print num | (1 << 1)
   print bin(num | (1 << 1))
   return num | (1 << 1)

print getBit(4,2)
print setBit(4,2)
