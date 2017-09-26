import sys

n = int(input().strip())

def printFactorial(n):
    currentProduct = n
    for q in range(1, n):
        currentProduct *= (n - q)
    return print(currentProduct)

printFactorial(n)
