package com.blueocn.HotelWebApplication.service;

import com.blueocn.HotelWebApplication.model.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {

    private static final long TOTAL_ROOMS = 10;
    private static final List<Room> ROOMS = new ArrayList<>();
    static {
        for (int i = 1; i <= TOTAL_ROOMS; i++) {
            ROOMS.add(
                    new Room(i,
                            "R"+ i,
                            "Room "+ i,
                            "Info "+ i)
            );
        }
    }

    public List<Room> getAllRooms() {
        return ROOMS;
    }
}
