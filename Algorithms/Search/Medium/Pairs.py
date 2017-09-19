# Head ends here
def pairs(a,k):
    # a is the list of numbers and k is the difference value

    a.sort()

    answer = 0
    i, j = 0 , 1

    while j < len(a):
        diff = a[j] - a[i]

        if (diff == k):
            answer+= 1
            j += 1
        elif (diff > k):
            i+=1
        else:
            j+=1

    return answer
# Tail starts here
if __name__ == '__main__':
    a = input().strip()
    a = list(map(int, a.split(' ')))
    _a_size=a[0]
    _k=a[1]
    b = input().strip()
    b = list(map(int, b.split(' ')))
    print(pairs(b,_k))
