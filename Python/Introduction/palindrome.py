name=input('Enter Name : ')

name=name.lower()

if name==name[::-1]:
    print('String is Palindrome')
else:
    print('String is not Palindrome')