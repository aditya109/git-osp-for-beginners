def kaprekars():
	kaps = []
	low = int(input())
	high = int(input())
	for num in range(low, high + 1):
		if is_kap(num):
			kaps.append(num)
	if len(kaps) == 0:
		print("INVALID RANGE")
	else:
		print(" ".join(str(x) for x in kaps))

def is_kap(num):
	s = str(num**2)
	right = s[len(s)//2:]
	left = '0' if s[:len(s)//2] == '' else s[:len(s)//2]
	return True if int(left) + int(right) == num else False

kaprekars()
