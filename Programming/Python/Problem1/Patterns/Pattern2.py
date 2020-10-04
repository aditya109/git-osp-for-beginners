#Contributed by @Hinal-Srivastava

#Alphabetical Equilateral Triangle

size = 7
asciiNumber = 65
m = (2 * size) - 2
for i in range(0, size):
    for j in range(0, m):
        print(end=" ")
    m = m - 1
    for j in range(0, i + 1):
        character = chr(asciiNumber)
        print(character, end=' ')
        asciiNumber += 1
    print(" ")