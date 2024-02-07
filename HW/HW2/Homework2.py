# Christopher Oh
# SJSU CS 146
# HW 2 - Python


def find_first_bad_version(versions):
    minimum = 0
    maximum = len(versions) - 1
    mid = (minimum + maximum) / 2

    while minimum != maximum:
        if is_bad_version(versions[mid]):
            maximum = mid
        else:
            minimum = mid + 1
        mid = (minimum + maximum) / 2
    return max


# placeholder function
def is_bad_version(version):
    return False
