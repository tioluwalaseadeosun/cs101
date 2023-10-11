myStr = "string value"
strList = list(myStr)
x = 0
y = 0
count = 0

# Question 1
while x < len(myStr):
  print(strList[x])
  x += 1
  
# Question 2
while y < len(myStr):
  if strList[y] == "a" or strList[y] == "e" or strList[y] == "i" or strList[y] == "o" or strList[y] == "u":
    count = count + 1
  y += 1
print(count)

# Question3
def add(val1, val2):
  return(val1 + val2)
  
val3 = add(5, 3)
print(val3)
