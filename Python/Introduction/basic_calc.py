num1=input('Enter Num 1 : ')
num2=input('Enter Num 2 : ')
oper=input('Enter Operator : ')

num1=float(num1)
num2=float(num2)

if oper=='+':
    total=num1+num2
elif oper=="-":
    total=num1-num2
elif oper=="*":
    total=num1*num2
elif oper=="/":
    total=num1/num2

print(f'Total = {total}')
