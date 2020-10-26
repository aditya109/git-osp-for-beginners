n=input("Enter a number to reverse: ")
if (int(n)>=2147483648 and int(n)<=2147483647):
    s=str(n)

    if s[0]=="-":
        s=s[1:]
        s1=s[::-1]
        for i in range(len(s1)):
            if(s1[i]=="0"):
                continue
            else:
                break
        print("-" + s1[i:])
    else:
        s1=s[::-1]
        for i in range(len(s1)):
            if(s1[i]=="0"):
                continue
            else:
                break
        print(s1[i:])

 