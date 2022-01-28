a=0
b=1
num=int(input("Enter n :"))
print(a)
print(b)
for val in range(2,num):
    c=a+b
    a=b
    b=c
    print(c)