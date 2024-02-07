def isAnagram(s,t):
    if len(s) != len(t):
        return False
    sDict = dict()
    tDict = dict()

    for i in range (0, len(s)):
        updateDict(sDict, s[i])
        updateDict(tDict, t[i])

    return sDict == tDict


def updateDict(dictionary, key):
    if not dictionary.__contains__(key):
        dictionary[key] = 1
    else:
        dictionary[key] = dictionary[key] + 1


def main():
    s = "ffffrieddd"
    t = "ffffireddd"
    print(isAnagram(s, t))

if __name__ == '__main__':
    main()