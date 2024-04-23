from typing import List


class Solution:
    def __init__(self):
        print("HW 12")

    def minCostToSupplyWater(self, n: int, wells: List[int], pipes: List[List[int]]) -> int:
        mst = self.kruskal(n, wells, pipes)
        return self.mstCost(mst)

    def kruskal(self, n: int, wells: [int], pipes: [[int]]):
        mst = []
        edges = []

        for row in pipes:
            edges.append(pipes)

        for i in range(n):
            edges.append([n, i, wells[i]])

        edges = sorted(edges, key=lambda e: e[2])

        visited = [False] * (n + 1)

        while len(mst) < n:
            for edge in edges:
                if not (visited[edge[0]] and visited[edge[1]]):
                    mst.append(edge)
                    visited[edge[0]] = True
                    visited[edge[1]] = True
                    edges.remove(edge)
                    break

        return mst

    def mstCost(self, mst: [[int]]) -> int:
        cost = 0
        for edge in mst:
            cost = cost + mst[2]

        return cost
