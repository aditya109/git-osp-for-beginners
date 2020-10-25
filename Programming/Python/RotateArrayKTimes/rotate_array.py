# Code to rotate a given array k times to the left
# and to the right and return both results.

def rotate_array(arr: [int], k: int) -> ([int], [int]):
    """Function to rotate the given array k times
    to both sides and return both results.

    :param [int] arr: Array to rotate.
    :param int k: Number of times to rotate the array, on both directions.
    :return: A tuple with the rotated arrays to the left and to the right.
    """

    # We check if k is greater than the total length so the following mutations
    # can be done. We need it to be smaller than the array length.
    if k >= len(arr):
        k %= len(arr)

    if k == 0:
        # If k equals 0 means that k was a multiple of the array length, thus no
        # mutation needs to be applied as the result would be the array itself.
        return arr, arr

    # To rotate to the right we take the k positions on
    # the back and put them in front of the others.
    array_to_right = arr[-k:] + arr[:-k]
    # To rotate to the left we take the k positions
    # on the front and append them to the others.
    array_to_left = arr[k:] + arr[:k]

    return array_to_left, array_to_right


if __name__ == "__main__":
    array = [1, 2, 3, 4, 5]
    k = 4
    l, r = rotate_array(array, k)
    print(l, r)
    # [5, 1, 2, 3, 4] [2, 3, 4, 5, 1]

    array = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    k = 4
    l, r = rotate_array(array, k)
    print(l, r)
    # [4, 5, 6, 7, 8, 9, 0, 1, 2, 3] [6, 7, 8, 9, 0, 1, 2, 3, 4, 5]
