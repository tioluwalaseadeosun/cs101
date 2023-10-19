  # 
 ###
#####
# write a loop that will print out lines 1-5

# i = 1
# space = 5 - i

def printStack(n):
  i = 1
  space = int((n - 1)/2)
  while i <= n:
    print(" "*space + "#"*i + " "*space)
    i = i + 2
    space = space - 1

# printStack(5)

def printStack2(n):
  i = 1
  while i <= n:
    s = int((n-i)/2)
    print(" "*s + "#"*i + " "*s)
    i += 2 

# result = printStack2(10)
# print(result)

def testReturn(x):
  x += 1
  return x
  # Functions stop executing the stuffs after a return stalement
  x += 10
  return x

# r = testReturn(2)
# print(r)


def printStack3(n):
  i = 0
  while i < n:
    i += 1
    if i%2 == 0 :
      continue
    s = int((n-i)/2)
    print(" "*s + "#"*i + " "*s)
    

printStack3(10)
