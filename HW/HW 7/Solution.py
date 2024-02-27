# Christopher Oh
# SJSU CS 146
# HW 7 - Meeting Rooms 2

from typing import List


class Solution:
    def __init__(self):
        print("HW 7")

    def minMeetingRooms(self, intervals: List[List[int]]) -> int:
        if not intervals or len(intervals) == 0:
            return 0

        rooms = [[]]

        for meeting in intervals:
            self.make_schedule(rooms, meeting)

        return len(rooms)

    def add_meeting(self, room=[], meeting=[]) -> bool:
        if len(room) == 0:
            room.append(meeting)
            return True

        if meeting[1] <= room[0][0]:
            room.insert(0, meeting)
            return True

        for i in range(len(room) - 1):
            if meeting[0] >= room[i][1] and meeting[1] <= room[i + 1][0]:
                room.insert(i + 1, meeting)
                return True

        if meeting[0] >= room[len(room) - 1][1]:
            room.append(meeting)
            return True

        return False

    def make_schedule(self, rooms=[], meeting=[]) -> bool:
        for room in rooms:
            if self.add_meeting(room, meeting):
                return True

        temp = [meeting]
        rooms.append(temp)
        return True


def main():
    #testCase = [[]]
    testCase = [[0, 5], [1, 3], [4, 10], [2, 3], [6, 8], [6, 8], [4, 7]]
    s = Solution()
    print(s.minMeetingRooms(testCase))


if __name__ == "__main__":
    main()

