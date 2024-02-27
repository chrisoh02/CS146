/**
 * Christopher Oh
 * SJSU CS 146
 * HW 7
 */

import java.util.ArrayList;

public class Solution2 {
    public Solution2 () {}

    public int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        ArrayList<ArrayList<int[]>> rooms = new ArrayList<>();
        rooms.add(new ArrayList<int[]>());

        for (int[] meeting : intervals) {
            makeSchedule(rooms, meeting);
        }

        return rooms.size();
    }


    /**
     * Checks if there is a slot for meeting in the room
     * If there is one, add the slot and return true
     * @param room
     * @param meeting
     * @return false if meeting couldn't be added
     */
    private Boolean addMeeting (ArrayList<int[]> room, int[] meeting) {
        //this room has not meetings scheduled
        if (room.isEmpty()) {
            room.add(meeting);
            return true;
        }

        //meeting's end time is before or equal to room's first meeting's start time
        if (meeting[1] <= room.get(0)[0]) {
            room.add(0, meeting); //add meeting at beginning
            return true;
        }

        for (int i = 0; i < room.size() - 1; i++) {
            if (meeting[0] >= room.get(i)[1] && meeting[1] <= room.get(i + 1)[0]) {
                room.add(i + 1, meeting);
                return true;
            }
        }

        //if meeting starts after or equal to room's last meeting's end time
        if (meeting[0] >= room.get(room.size() - 1)[1]) {
            room.add(meeting); //add meeting at end
            return true;
        }

        //all prior meetings in this room overlap
        return false;
    }

    private Boolean makeSchedule (ArrayList<ArrayList<int[]>> rooms, int[] meeting) {
        for (ArrayList<int[]> room : rooms) {
            if (addMeeting(room, meeting)) {
                return true;
            }
        }
        ArrayList<int[]> temp = new ArrayList<>();
        temp.add(meeting);
        rooms.add(temp);
        return true;
    }
}
