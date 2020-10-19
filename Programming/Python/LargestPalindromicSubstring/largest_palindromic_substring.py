def find_longest_palindromic_substring(s):
    list_ = []
    all_substrings_of_string = res = [s[i: j] for i in range(len(s)) for j in range(i + 1, len(s) + 1)] 
    current_palindrome=0
    for f in all_substrings_of_string:
        if is_palindrome(f):
            if current_palindrome_lenght < len(f):
                current_palindrome=f
    return current_palindrome_lenght


def is_palindrome(s):
    queue = []
    for f in s:
        queue.append(f)
    stopping_string_size = 1 if len(queue)%2 == 1 else 0
    while not len(queue) == stopping_string_size:
        front = queue.pop(0)
        rear = queue.pop(len(queue)-1)
        if str(front) != str(rear):
            return False
        
    return True

    find_longest_palindromic_substring("babad")
