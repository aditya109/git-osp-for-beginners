# Python code to find frequency of each word 
def freq(str1):

    # break the string into list of words 
    str1 = str1.split()        
    str2 = []
    l = []

    # loop till string values present in list str 
    for i in str1:            

        # checking for the duplicacy 
        if i not in str2: 

            # insert value in str2 
            str2.append(i) 
            
    for i in range(0, len(str2)): 

        # count the frequency of each word(present 
        # in str2) in str and print 
        l.append(str1.count(str2[i]))
    s = ""
    for j in l:
                s = s + str(j) + " "
    print(len(l))
    print(s)

def main(): 
    str1 ='apple mango apple orange orange apple guava mango mango'
    freq(str1)
    

if __name__=="__main__": 
    main()           # call main function 
