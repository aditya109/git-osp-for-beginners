def myPi(n):
    denominator = 1
    addto = 1

    for i in range(n):
        denominator = denominator + 2
        addto = addto - (1/denominator)
        denominator = denominator + 2
        addto = addto + (1/denominator)

    pi = addto * 4

    return(pi)

print(myPi(1000000))