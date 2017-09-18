s = (input().replace(" ","")).lower()

letterSet = set()
for letter in s:
    if (letter not in letterSet):
        letterSet.add(letter)

if (len(letterSet) == 26):
    print ("pangram")

else:
    print("not pangram")
