# Take input from user
N = int(input("Find prime numbers upto : "))

print("\nAll prime numbers upto", N, "are : ")

for num in range(1 , N + 1):
    if num > 1:
        for i in range(2, int(num/2) + 1):
            if (num % i) == 0:
                break
        else:
            print(num ,end=" ")
