
# Program to find the number of occurrence of each unique word in the sequence of occurrence of each word.

from collections import Counter

if __name__ == '__main__':
    n = int(input())
    w = []
    for i in range(n):
        x = input()
        w.append(x)
    c = Counter(w)
    l = len(c)
    print(l)
    v = c.values()
    for i in v:
        print(i, end=' ')
