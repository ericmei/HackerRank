totalWords = int(input())

for number in range(totalWords):
    currentWord = input()
    index = 0
    dupCtr = 0
    for index in range(len(currentWord) - 1):
        if (currentWord[index] == currentWord[index + 1]):
            dupCtr +=1

    print (dupCtr)

    
