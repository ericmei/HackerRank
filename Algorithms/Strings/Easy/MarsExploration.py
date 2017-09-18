import sys

S = input().strip()
messageLen = len(S)
i = 0
mispelled =0

while(i <messageLen ):
    if (S[i] != "S"):
        mispelled +=1
    if (S[i+1] != "O"):
        mispelled +=1
    if (S[i+2] != "S"):
        mispelled +=1
    i += 3

print(mispelled)
