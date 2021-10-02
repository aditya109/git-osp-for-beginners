def combinationSum(candidates, target):
        candidates.sort()
        def dfs(start,current, sum):
            if sum == target:
                result.append([]+current)
                return
            for i in range(start,len(candidates)):
                if(sum+candidates[i] > target):
                    break
                current.append(candidates[i])
                dfs(i,current,sum+candidates[i])
                current.pop()
                
        result = []
        dfs(0,[],0)
        return result

if __name__ == '__main__':
    import sys

    candidates = [2,3,6,7]; target = 7
    output = combinationSum(candidates, target)
    print(output)
    #Output: [[2,2,3],[7]]
    
    candidates = [2,3,5]; target = 8
    output = combinationSum(candidates, target)
    print(output)
    #Output: [[2,2,2,2],[2,3,3],[3,5]]
   
