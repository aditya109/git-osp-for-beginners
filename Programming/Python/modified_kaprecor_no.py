x = int(input())
y = int(input())
for i in range(x,y+1):
    n = i*i
    f = 0
    x = 10
    s = n
    while s!=0:
        if (n//x)+(n%x)==i:
            f = 1
            break
        x*=10
        s = s//10

    if f==1:
        print(i, end=" ")
