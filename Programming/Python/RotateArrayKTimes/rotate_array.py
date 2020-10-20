
def rotate_array(array, k):
    if (len(array) == k):
        return array, array

    array_to_right = array[-k:] + array[:-k]
    array_to_left = array[k:] + array[:k]

    return array_to_left, array_to_right


if __name__ == "__main__":
    array = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    k = 4
    l, r = rotate_array(array, k)
    print(l, r)
