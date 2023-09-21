# Write a function that flattens a list. 
# Its elements may consist of multi-layered lists (such as [[3],2]) or non-scalar data.

l = [[1,'a',['cat'],2],[[[3]],'dog'],4,5]
l1 = []

def flatten(n):
    for i in n :
        if isinstance(i,list): # check if it's a list
            flatten(i) # If it is a list, send it to the flatten function again
        else:
            l1.append(i)

flatten(l)
print(l1)
