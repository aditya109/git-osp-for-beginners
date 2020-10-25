def leibniz(k: int) -> float:
	sum = 0.0
	for i in range(k):
		sum += leibniz_step(i)

	return sum*4


def leibniz_step(k: int) -> float:
	return (-1)**k / (2*k + 1)


if __name__ == '__main__':
	print(leibniz(10000))
