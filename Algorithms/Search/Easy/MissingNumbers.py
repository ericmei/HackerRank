n1 = raw_input().strip()
list1 = map(int,raw_input().strip().split())
n2 = raw_input().strip()
list2 = map(int, raw_input().strip().split())

m = max(list1 +list2)

table = [0 for _ in range(m+1)]

for a in list1:
    table[a] += 1

for b in list2:
    table[b] -= 1

values = [y for y in range(len(table)) if table[y] != 0]
for a in values:
    print a,
