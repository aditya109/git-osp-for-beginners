def MaximumGap(arr, n):
    INT_MIN, INT_MAX = float('-inf'), float('inf')
    if n > 1:
        # Find maximum and minimum in arr[]
        maxVal, minVal = arr[0], arr[0]
        for i in range(1, n):
            maxVal = max(maxVal, arr[i])
            minVal = min(minVal, arr[i])

        # Arrays to store maximum and minimum
        # values in n-1 buckets of differences.
        maxBucket = [INT_MIN] * (n - 1)
        minBucket = [INT_MAX] * (n - 1)

        # Expected gap for every bucket.
        delta = (maxVal - minVal) // (n - 1)

        # Traversing through array elements and
        # filling in appropriate bucket if bucket
        # is empty. Else updating bucket values.
        for i in range(0, n):
            if arr[i] == maxVal or arr[i] == minVal:
                continue

            # Finding index of bucket.
            index = (arr[i] - minVal) // delta

            # Filling/Updating maximum value
            # of bucket
            if maxBucket[index] == INT_MIN:
                maxBucket[index] = arr[i]
            else:
                maxBucket[index] = max(maxBucket[index], arr[i])

            # Filling/Updating minimum value of bucket
            if minBucket[index] == INT_MAX:
                minBucket[index] = arr[i]
            else:
                minBucket[index] = min(minBucket[index], arr[i])

        # Finding maximum difference between
        # maximum value of previous bucket
        # minus minimum of current bucket.
        prev_val, max_gap = minVal, 0

        for i in range(0, n - 1):
            if minBucket[i] == INT_MAX:
                continue
            max_gap = max(max_gap, minBucket[i] - prev_val)
            prev_val = maxBucket[i]
        max_gap = max(max_gap, maxVal - prev_val)
        return max_gap
    else:
        return 0

# Driver Code
# arr = [3,6,9,1]
# n = len(arr)
# print(MaximumGap(arr, n))
