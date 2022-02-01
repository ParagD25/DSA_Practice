amount=int(input("Enter Amount : "))
dep=int(input("Enter Depreciation : "))
time=int(input("Enter TIme : "))
temp=amount
for val in range(time):
    temp=(temp*(100-dep))/100

print(temp)