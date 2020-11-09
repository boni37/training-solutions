package week02;

import java.util.ArrayList;
import java.util.List;

public class Office {

    public List<MeetingRoom> meetingRooms = new ArrayList<>();

    public List<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }


    public void setMeetingRooms(List<MeetingRoom> meetingRooms) {
        this.meetingRooms = meetingRooms;
    }

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        for (MeetingRoom meetingRoom: meetingRooms) {
            System.out.println(meetingRoom.getName());
        }
    }

    public void printNamesReverse() {
        for (int i = meetingRooms.size(); i <= 0; i--) {
            System.out.println(meetingRooms.get(i));
        }
    }

    public void printEventNames() {
       for (int i = 0; i < meetingRooms.size(); i += 2) {
            System.out.println(meetingRooms.get(i));
        }
    }

    public void printAreas() {

    }

    public void printMeetingRoomsWithName() {

    }

    public void printMeetingRoomsContains() {

    }

    public void printAreasLargerThan(int area) {

    }


}

