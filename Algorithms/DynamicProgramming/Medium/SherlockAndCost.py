testcase=int(input())
for i in range(testcase):
    n=int(input())
    b=[int(x) for x in input().split(' ')]
    maxi, max1 = 0, 0
    for i in range(1,len(b)):
        curr, prev = b[i], b[i-1]
        newmaxi = max(maxi + abs(curr - prev), max1 + (curr - 1))
        newmax1 = max(maxi + abs(1 - prev), max1)
        maxi, max1 = newmaxi, newmax1
    print(max(maxi, max1))
    
