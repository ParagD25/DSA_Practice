p=float(input("Enter Principal Amount : "))
r=float(input("Enter Rate : "))
t=int(input("Enter Time : "))

ci=p*((1+(r/100))**r)

print('Compund Interest = ',ci)