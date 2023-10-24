myList = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

def getPrime(n, i):
  r = 0
  for x in range(1, n):
    if n == 1:
      return 0
    if n == 2:
      return 2
    for y in range(2, x):
      if y == x:
        r += 1
        if r == i:
          return x
      # test that x can be divided by y without a remainder
      if x%y == 0:
        break
  
  
result = getPrime(10, 1)
print(result)

result = getPrime(10, 2)
print(result)

result = getPrime(10, 3)
print(result)

result = getPrime(10, 4)
print(result)
