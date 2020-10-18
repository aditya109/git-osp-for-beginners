n=int(input())
s=str(n)
s=s[::-1]
if n>=0:
	print(int(s))
else:
	print('-',end="")
	print(int(s[:-1]))