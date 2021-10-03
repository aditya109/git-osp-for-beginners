n=int(input("Enter the number:")) 
sum=0
while n!=0 :
    m=n%10
    n=n/10
    sum=int(sum+m)
print("Sum of digits of the number entered: ", sum)