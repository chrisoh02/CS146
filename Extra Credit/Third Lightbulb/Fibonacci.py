# Christopher Oh
# SJSU CS 146
# Bonus Questions: "Third lightbulb's the charm"
# Fibonacci Sequence

def nth_Fibonacci (n):
    if n < 0:
        print("Error: n must be a non-negative integer")
        return -1

    a = 0
    b = 1

    for i in range(1, n + 1):
        temp = a
        a = b
        b = temp + b

    return a


def main():
    print(nth_Fibonacci(17))


if __name__ == '__main__':
    main()
