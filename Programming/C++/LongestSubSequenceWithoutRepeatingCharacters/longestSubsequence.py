string = input()
seen = {} 
maximum_length = 0
start = 0 
       
for end in range(len(string)): 
    if string[end] in seen: 
        start = max(start, seen[string[end]] + 1) 
    seen[string[end]] = end 
    maximum_length = max(maximum_length, end-start + 1) 

print(maximum_length) 