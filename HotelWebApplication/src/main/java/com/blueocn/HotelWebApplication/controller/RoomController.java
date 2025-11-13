package com.blueocn.HotelWebApplication.controller;

import com.blueocn.HotelWebApplication.model.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {

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

    @GetMapping
    public String getAllRooms(Model model) {
        model.addAttribute("rooms", ROOMS);
        return "rooms/rooms";
    }

}
