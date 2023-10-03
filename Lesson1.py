class Lesson1:
  
  # Numeric data types(but in Py, there are just three; int, float, and complex)
  myByte = 0b1001
  myShort = 254
  myInt = 231
  myFloat = 2.0
  myDouble = 231
  
  # Alphanumeric, but in Py, it all counts as just string
  mychar = 'e'
  myStr = "Stringy"
  
  # bool
  myBool = True
  
  # array
  myArrayButStillList = ["water", "superrrrr", "natural"]

  
  
  print(myByte)
  print(myShort)
  print(myInt)
  print(myFloat)
  print(myDouble)
  print(mychar)
  print(myStr)
  print(myBool)
  print(myArrayButStillList)
  for x in myArrayButStillList:
    print(x)
  
# Object
myObject = Lesson1()

stringedObject = str(myObject)

print(myObject.myInt)

print(stringedObject)
