def twoSum(numbers, target):
    for i, num in enumerate(numbers):
        for j, numb in enumerate(numbers):
            if i == j:
                continue
            elif num + numb == target:
                return [i+1,j+1]
