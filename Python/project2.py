# Write a function that reverses the elements in the given list. 
# If the elements inside the list also contain the list, reverse their elements as well.

arr = [[1, 2], [3, 4], [5, 6, 7]]
  
def reversed(l):
    l.reverse() # reversed the list
    
    for i in l:
        if type(i)==list: # If the data type of the element is list, 
            reversed(i)   # we send it to the reversed function again.

reversed(arr)
print(arr)
