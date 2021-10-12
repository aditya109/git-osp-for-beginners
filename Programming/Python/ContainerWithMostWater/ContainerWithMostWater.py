"""
Question: Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). 
Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.
"""


def max_capacity(height):
    max_area = 0
        
    i = 0
    j = len(height) - 1
    
    # Using the two pointers namely i and j
    while i < j:
        curr_area = (j - i) * min(height[i], height[j])
        max_area = max(max_area, curr_area)
        if height[i] <= height[j]:
            i = i + 1
        else:
            j = j - 1
    return max_area

def main():
    height = list(map(int,input().split(" ")))
    print(max_capacity(height))


if __name__ == '__main__':
    main()
    
#Time Complexity = O(n)
#Space Complexity = O(1)
