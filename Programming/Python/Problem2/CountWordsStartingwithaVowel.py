#Contributed by @Mansi_Wagh

str=input()
vowels = "aeiouAEIOU"
words = str.split(" ")
count = 0
for word in words:
    if word[0] in vowels:
        count += 1

print(count)
