x = int(input());s = input() 
d = {'A': 0, 'T': 0, 'C': 0, 'G': 0}
for i in s:d[i] += 1
x = len(s);n = x / 4;i = 0;j = 0;min = x
if d['A'] == n and d['T'] == n and d['C'] == n and d['G'] == n:print(0)
else:
    while i < x and j < x:
        while (d['A'] > n or d['C'] > n or d['T'] > n or d['G'] > n) and i < x:d[s[i]] -= 1;i += 1
        while d['A'] <= n and d['C'] <= n and d['T'] <= n and d['G'] <= n:d[s[j]] += 1;j += 1
        if i - j < min:
            min = i - j + 1
    print(min)
