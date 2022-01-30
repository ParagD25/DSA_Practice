large=0
while True:
    inp=int(input("enter num : "))
    if inp==0:
        break
    if inp>large:
        large=inp

print('Largest = ',large)