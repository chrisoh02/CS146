def canFinish(numCourses, prerequisites):
    prereqs = [[]]
    visited = []
    for i in range(0, numCourses):
        prereqs[i].append(prerequisites[i][1])
        visited.append(False)

    for i in range(0, numCourses):
        if not dfs(i, prereqs, visited):
            return False

    return True


def dfs(course, prereqs, visited):
    if visited[course]:
        return False
    visited[course] = True

    for i in range(0, len(prereqs)):
        if not dfs(prereqs[course][i], prereqs, visited):
            return False

        visited[course] = False
        return True