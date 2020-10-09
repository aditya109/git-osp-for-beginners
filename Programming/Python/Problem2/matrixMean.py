from functools import reduce
# matrix mean
def matrix_mean(mat):

    flatten = [j for i in mat for j in i]
    sum = reduce(lambda a,b:a+b,flatten)
    # print(sum)
    return sum/len(flatten)

mat = [[5,6,7] , [7,5,6]]
print(matrix_mean(mat))
mat = [[5, 6, 7, 4, 8]]
print(matrix_mean(mat))
