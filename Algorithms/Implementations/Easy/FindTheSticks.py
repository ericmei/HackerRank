import sys

n = int(input().strip())
arr = [int(arr_temp) for arr_temp in input().strip().split(' ')]

list.sort(arr)
counter = 0
mostRecentNum = -1
for i in range(len(arr)):
    if (arr[i] == mostRecentNum):
        continue
    else:
        counter += (arr[i] - counter)
        mostRecentNum = arr[i]
        print(len(arr) - i)
