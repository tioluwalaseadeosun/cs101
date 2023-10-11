myStr = "string value"
# strList = list(myStr)

# Question 1
x = 0

while x < len(myStr):
  # print(strList[x])
  print(myStr[x])
  x += 1
  
# Question 2
y = 0
count = 0

while y < len(myStr):
  # if strList[y] == "a" or strList[y] == "e" or strList[y] == "i" or strList[y] == "o" or strList[y] == "u":
  if myStr[y].lower() in ["a", "e", "i", "o", "u"]:
    count = count + 1
  y += 1

print(count)

# Question3
def add(val1, val2):
  return(val1 + val2)
  
val3 = add(5, 3)
print(val3)
