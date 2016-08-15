a = [1,2,3,3,4,4,5,6,7,8,9]

"""
## Just to find if dups exists or not! 
if len(set(a)) != len(a):
   print("Dups found!")
"""

seen = set()
unique = []
dups = []

for x in a:
    if x not in seen:
        unique.append(x)
        seen.add(x)
    else:
        dups.append(x)
print "Duplicates: ", ', '.join(str(x) for x in dups)
print unique
