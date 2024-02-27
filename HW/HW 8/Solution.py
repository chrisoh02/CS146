# Christopher Oh
# SJSU CS 146
# HW 8 - Longest Palindrome


class Solution:
    def __init__(self):
        print("HW 8")

    def longestPalindrome(self, s):
        length = 0
        freq = dict()

        for letter in s:
            if letter in freq:
                freq[letter] = freq[letter] + 1
                if freq[letter] % 2 == 0:
                    freq[letter] = 0
                    length = length + 2
            else:
                freq[letter] = 1

        for num in freq.values():
            if num == 1:
                length = length + 1
                break

        return length


