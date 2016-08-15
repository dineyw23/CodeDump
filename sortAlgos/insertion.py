a = [5,1,3,2,1]

print"Unsorted Array:", a
for i in range(0,len(a)):
    x = a[i]
    j = i - 1
    while j >=0 and a[j] > x:
        a[j+1] = a[j]
        j = j - 1
    a[j+1] = x

print "Sorted Array:", a
