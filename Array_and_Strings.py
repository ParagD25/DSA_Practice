#Arrays And Strings
#Sol 1.1
"""user=input('Enter String : ')
lst_user=list(user)
new=[]
for val in lst_user:
    if val not in new:
        new.append(val)
    else:
        pass
print(new)"""

#sol 1.2.1
user=input('Enter String : ')
lst_1=list(user)
m=0
n=len(user)-1
lst_2=[]
while m<=n:
    lst_2.append(lst_1[n])
    n-=1
word=('').join(lst_2)
print(word)

#sol 1.2.2
"""user=input('Enter String : ')
print(user[::-1])"""