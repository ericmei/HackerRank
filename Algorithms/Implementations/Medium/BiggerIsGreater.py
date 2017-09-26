import sys
from sys import stdin

def next_permutation(arr):
    # Find non-increasing suffix
    i = len(arr) - 1
    while i > 0 and arr[i - 1] >= arr[i]:
        i -= 1
    if i <= 0:
        return False

    # Find successor to pivot
    j = len(arr) - 1
    while arr[j] <= arr[i - 1]:
        j -= 1
    arr[i - 1], arr[j] = arr[j], arr[i - 1]

    # Reverse suffix
    arr[i : ] = arr[len(arr) - 1 : i - 1 : -1]
    return True

for numLines in range(int(stdin.readline())):

    nextInput = list(stdin.readline().strip())

    if (next_permutation(nextInput)):
        print (''.join(nextInput))
    else:
        print ("no answer")
