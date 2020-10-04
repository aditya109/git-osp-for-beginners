a = str(input("Enter string : "))
b = a.split(" ")
c=0
for i in b:
    if(i[0] in ('AEIOUaeiou')):
        c=c+1
print("Count of words starting with vowels : ",c)