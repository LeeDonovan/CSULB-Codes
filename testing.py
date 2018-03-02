def reverse_string(st):
    rev = ''
    for i in range(len(st) -1,-1,-1):
        rev = rev + st[i]
    return rev
print(reverse_string("hehexd"))

def is_palindrome(st):
    for i in range(len(st)//2):
        j = len(st) -i -1
        if st[i] != st[j]:
            return False
    return True
print(is_palindrome("ilovevoli"))


# this one

def is_palindrome(st):
    i = 0
    j = len(st) - 1
    while i < len(st) // 2:
        if st[i] != st[j]:
            return False
        i += 1
        j -= 1
    return True

