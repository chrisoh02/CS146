from typing import List


class TripleSum:
    def __init__(self):
        print("Triple Sum")

    def threeSum(self, nums: List[int]) -> List[List[int]]:
        triplets = []
        if len(nums) < 3:
            print("Invalid array size")
            return triplets

        nums.sort()

        for a in range(0, len(nums) - 2):
            for b in range(a + 1, len(nums) - 1):
                third = -(nums[a] + nums[b])
                index = self.binary_search(nums, third, b + 1, len(nums) - 1)
                if index > 0:
                    trio = [nums[a], nums[b], third]
                    if trio not in triplets:
                        triplets.append(trio)

        return triplets

    def binary_search(self, nums, target, left, right) -> int:
        while left <= right:
            mid = int((left + right) / 2)
            if nums[mid] > target:
                right = mid - 1
            elif nums[mid] < target:
                left = mid + 1
            else:
                return mid
        return -1

def main():
    testCase = [-5, 0, 5, 10, -10, 0, 2, 3, 0]
    t = TripleSum()
    answer = t.threeSum(testCase)

    print(answer)


if __name__ == "__main__":
    main()