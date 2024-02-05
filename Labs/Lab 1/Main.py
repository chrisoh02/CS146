def twoSum (nums, target):
    answer = []
    dictionary = dict() #key = integer value, target = index
    for i in range(len(nums)):
        dictionary[nums[i]] = i

    for key in dictionary.keys():
        if dictionary.__contains__(target - key) and key != target - key:
            answer[0] = key
            answer[1] = target - key
            return answer

    return answer
