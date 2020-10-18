from Programming.Python.AddTwoNumbers.solution import *
import sys

sample_1 = [2,4,3]
sample_2 = [5,6,4]
sample_3 = [0]
sample_4 = [9,9,9,9,9,9,9]
sample_5 = [9,9,9,9]
sample_6 = [1,2,3,4,5]
sample_7 = [7,6,2]
sample_8 = [9,0,0,0,8,9]

def test_get_input_reverse_sum():
    assert get_input_reverse_sum(sample_1) == 342
    assert get_input_reverse_sum(sample_2) == 465
    assert get_input_reverse_sum(sample_3) == 0
    assert get_input_reverse_sum(sample_4) == 9999999
    assert get_input_reverse_sum(sample_5) == 9999
    assert get_input_reverse_sum(sample_6) == 54321
    assert get_input_reverse_sum(sample_7) == 267
    assert get_input_reverse_sum(sample_8) == 980009

def test_full_add_flow():
    python_version = float(str(sys.version_info.major) + '.' + str(sys.version_info.minor))
    if (python_version < 3.9):
        print("Python 3.9 version NOT found, running if block of test")
        assert get_sum_of_two_numbers(get_input_reverse_sum(sample_1), get_input_reverse_sum(sample_2)) == [7,0,8]
        assert get_sum_of_two_numbers(get_input_reverse_sum(sample_3), get_input_reverse_sum(sample_3)) == [0]
        assert get_sum_of_two_numbers(get_input_reverse_sum(sample_4), get_input_reverse_sum(sample_5)) == [8,9,9,9,0,0,0,1]
        assert get_sum_of_two_numbers(get_input_reverse_sum(sample_1), get_input_reverse_sum(sample_3)) == [2,4,3]
        assert get_sum_of_two_numbers(get_input_reverse_sum(sample_2), get_input_reverse_sum(sample_4)) == [4,6,4,0,0,0,0,1]
        assert get_sum_of_two_numbers(get_input_reverse_sum(sample_5), get_input_reverse_sum(sample_6)) == [0,2,3,4,6]
        assert get_sum_of_two_numbers(get_input_reverse_sum(sample_8), get_input_reverse_sum(sample_7)) == [6,7,2,0,8,9]
        assert get_sum_of_two_numbers(get_input_reverse_sum(sample_7), get_input_reverse_sum(sample_6)) == [8,8,5,4,5]
    else:
        print ("Python 3.9 version found, running else block of test")
        assert get_sum_of_two_numbers_39(get_input_reverse_sum(sample_1), get_input_reverse_sum(sample_2)) == [7,0,8]
        assert get_sum_of_two_numbers_39(get_input_reverse_sum(sample_3), get_input_reverse_sum(sample_3)) == [0]
        assert get_sum_of_two_numbers_39(get_input_reverse_sum(sample_4), get_input_reverse_sum(sample_5)) == [8,9,9,9,0,0,0,1]
        assert get_sum_of_two_numbers_39(get_input_reverse_sum(sample_1), get_input_reverse_sum(sample_3)) == [2,4,3]
        assert get_sum_of_two_numbers_39(get_input_reverse_sum(sample_2), get_input_reverse_sum(sample_4)) == [4,6,4,0,0,0,0,1]
        assert get_sum_of_two_numbers_39(get_input_reverse_sum(sample_5), get_input_reverse_sum(sample_6)) == [0,2,3,4,6]
        assert get_sum_of_two_numbers_39(get_input_reverse_sum(sample_8), get_input_reverse_sum(sample_7)) == [6,7,2,0,8,9]
        assert get_sum_of_two_numbers_39(get_input_reverse_sum(sample_7), get_input_reverse_sum(sample_6)) == [8,8,5,4,5]