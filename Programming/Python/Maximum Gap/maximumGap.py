
def max(a, b):
    if a<b:
        return b
    else:
        return a


if __name__ == "__main__":
    data = [int(i) for i in input().split(' ')]
    data = sorted(data)
    prev = data.__getitem__(0)
    ans = 0
    for i in data:
        ans = max(ans,i-prev)
        prev = i
    print(ans)