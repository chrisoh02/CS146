import re

def palindrome (s):
    s = s.lower() #sets string s to lowercase
    filtered = re.sub('[^a-z0-9]', '', s)
    backwards = filtered[::-1]
    return filtered == backwards

def main():
    print(palindrome("123 HELLO &*%^ OLL EH 3 2 1 $%$("))


if __name__ == '__main__':
    main()