import sys

counter = 1
s = input().strip()
for letter in s:
    if (letter.isupper()):
        counter +=1

print(counter)
