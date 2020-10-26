def get_input_reverse_sum(input):
    result = 0
    for index, number in reversed(list(enumerate(input))):
        result += ((10 ** index) * number)
    return result

# Python 3.8 and below
def get_sum_of_two_numbers(number_1, number_2):

    total_sum = number_1 + number_2

    final_result_list=[]

    while (total_sum != 0):
        final_result_list.append(total_sum % 10)
        total_sum = total_sum // 10

    return final_result_list

# Using Python 3.9 walrus operator
def get_sum_of_two_numbers_39(number_1, number_2):
    
    total_sum = number_1 + number_2

    final_result_list=[]
    # Since the walrus operator, requires one execution on total_sum,
    # thus performing pre appending of sum's first remainder.
    final_result_list.append(total_sum % 10)
    while (num := total_sum // 10) != 0:
        final_result_list.append(num % 10)
        total_sum = num

    return final_result_list


if __name__ == '__main__':
    import sys

    sample_1 = [2, 4, 3]
    sample_2 = [5, 6, 4]
    sample_3 = [0]
    sample_4 = [9, 9, 9, 9, 9, 9, 9]
    sample_5 = [9, 9, 9, 9]
    sample_6 = [1, 2, 3, 4, 5]
    sample_7 = [7, 6, 2]
    sample_8 = [9, 0, 0, 0, 8, 9]

    python_version = float(str(sys.version_info.major) + '.' + str(sys.version_info.minor))

    if (python_version < 3.9):
        print("Python 3.9 version NOT found, running if block of test")
        print(get_sum_of_two_numbers(get_input_reverse_sum(sample_1), get_input_reverse_sum(sample_2)))
        print(get_sum_of_two_numbers(get_input_reverse_sum(sample_3), get_input_reverse_sum(sample_3)))
        print(get_sum_of_two_numbers(get_input_reverse_sum(sample_4), get_input_reverse_sum(sample_5)))
        print(get_sum_of_two_numbers(get_input_reverse_sum(sample_1), get_input_reverse_sum(sample_3)))
        print(get_sum_of_two_numbers(get_input_reverse_sum(sample_2), get_input_reverse_sum(sample_4)))
        print(get_sum_of_two_numbers(get_input_reverse_sum(sample_5), get_input_reverse_sum(sample_6)))
        print(get_sum_of_two_numbers(get_input_reverse_sum(sample_8), get_input_reverse_sum(sample_7)))
        print(get_sum_of_two_numbers(get_input_reverse_sum(sample_7), get_input_reverse_sum(sample_6)))
    else:
        print("Python 3.9 version found, running else block of test")
        print(get_sum_of_two_numbers_39(get_input_reverse_sum(sample_1), get_input_reverse_sum(sample_2)))
        print(get_sum_of_two_numbers_39(get_input_reverse_sum(sample_3), get_input_reverse_sum(sample_3)))
        print(get_sum_of_two_numbers_39(get_input_reverse_sum(sample_4), get_input_reverse_sum(sample_5)))
        print(get_sum_of_two_numbers_39(get_input_reverse_sum(sample_1), get_input_reverse_sum(sample_3)))
        print(get_sum_of_two_numbers_39(get_input_reverse_sum(sample_2), get_input_reverse_sum(sample_4)))
        print(get_sum_of_two_numbers_39(get_input_reverse_sum(sample_5), get_input_reverse_sum(sample_6)))
        print(get_sum_of_two_numbers_39(get_input_reverse_sum(sample_8), get_input_reverse_sum(sample_7)))
        print(get_sum_of_two_numbers_39(get_input_reverse_sum(sample_7), get_input_reverse_sum(sample_6)))

