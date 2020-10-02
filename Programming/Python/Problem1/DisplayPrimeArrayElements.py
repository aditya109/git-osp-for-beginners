def main():

    arr=[100,31,89,43,20,11,0]


    # prime numbers are greater than 1
    for i in range(0,len(arr)):
        if arr[i] > 1:
       # check for factors
           for j in range(2,arr[i]):
               if (arr[i] % j) == 0:
                   print(arr[i],"is not a prime number")
                   break
               else:
                   print(arr[i],"is a prime number")
                   break
       
    # if input number is less than
    # or equal to 1, it is not prime
        else:
           print(arr[i],"is not a prime number")
        
        
if __name__ == "__main__":
    main()
