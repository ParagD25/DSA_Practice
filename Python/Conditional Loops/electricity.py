unit=float(input("Enter Unit : "))

if unit>0 and unit<100:
    rate=(10*unit)

elif unit>100 and unit<200:
    rate=(10*100)+(15*(unit-100))

elif unit>200 and unit<300:
    rate=(10*100)+(15*100)+(20*(unit-200))

else:
    rate=(10*100)+(15*100)+(20*100)+(25*(unit-300))

print(f'Electricity Bill = {rate}')
