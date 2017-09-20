#!/bin/python3

import sys


t = int(input().strip())
for a0 in range(t):
    numberLength=int(input())

    numFives = numberLength

    while (numFives % 3 != 0):
        if (numFives % 3 == 1):
            numFives -= 10

        else:
            numFives -= 5

    if (numFives < 0):
        print ("-1")

    else:
        print (numFives * '5' + (numberLength - numFives) * '3')

    
