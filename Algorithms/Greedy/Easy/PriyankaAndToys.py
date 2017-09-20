import sys

totalToys = int(input().strip())

toyWeights = list(map(int, input().strip().split()))
toyWeights.sort()

minUnits = 0
currentMinToyWeight = -sys.maxsize


for toyWeight in toyWeights:
    if (toyWeight > currentMinToyWeight + 4):
        currentMinToyWeight = toyWeight
        minUnits += 1;

print (minUnits)
