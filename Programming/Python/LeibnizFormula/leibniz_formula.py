def leibniz(k: int) -> float:
	sum = 0.0

	for i in range(k):
		sum += leibniz_step(k)

	return sum*4


def leibniz_step(k: int) -> float:
	return (-1)**k / (2*k + 1)