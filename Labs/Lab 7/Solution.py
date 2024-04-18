from _ast import List

class Solution:
    def __init__(self):
        print("Lab 7")

    def findTheCity(self, n: int, edges: List[List[int]], distanceThreshold: int) -> int:
        matrix = [[10001] * n for _ in range(0, n)]
        for city1, city2, dist in edges:
            matrix[city1][city2] = dist
            matrix[city2][city1] = dist
        for i in range(0, n):
            matrix[i][i] = 0

        for a in range(0, n):
            for b in range(0, n):
                for c in range(0, n):
                    matrix[b][c] = min(matrix[b][c], matrix[b][a] + matrix[a][c])

        city = 0
        smallestCount = n

        for r in range(0, n):
            count = 0
            for c in range(0, n):
                if matrix[r][c] <= distanceThreshold:
                    count = count + 1
            if count <= smallestCount:
                city = r
                smallestCount = count

        return city

