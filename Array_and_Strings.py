#Arrays And Strings
#Sol 1.1
user=input('Enter String : ')
lst_user=list(user)
new=[]
for val in lst_user:
    if val not in new:
        new.append(val)
    else:
        pass
print(new)