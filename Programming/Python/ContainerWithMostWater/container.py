#Python3 implementation
#Time Complexity = O(n)
#Space Complexity = O(1)

def max_capacity(height):
    max_area = 0
        
    i = 0
    j = len(height) - 1
    
    #Solution using two pointers
    while i < j:
        curr_area = (j - i) * min(height[i], height[j])
        max_area = max(max_area, curr_area)
        if height[i] <= height[j]:
            i += 1
        else:
            j -= 1
    return max_area

def main():
    height = [int(x) for x in input().split()] #faster than input using map()
    print(max_capacity(height))


if __name__ == '__main__':
    main()
    
    