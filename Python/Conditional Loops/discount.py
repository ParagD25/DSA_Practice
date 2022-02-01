price=int(input('Enter Price : '))
dis=int(input("Enter Discount : "))

discount=price*((100-dis)/100)
dp=price-discount

print(f'Discount = {discount}')
print(f'Discounted Price = {dp}')