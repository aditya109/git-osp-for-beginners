
def leibniz(k):
    s = 0.0
    for i in range(k):
        s += ((-1)**i)/(2*i+1)
    
    pi = s*4
    return pi
 

# execution begins here

# scanning the value of k
k = int(input())

print(leibniz(k))
    