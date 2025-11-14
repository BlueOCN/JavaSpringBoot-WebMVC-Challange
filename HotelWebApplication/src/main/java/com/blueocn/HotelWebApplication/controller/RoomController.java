package com.blueocn.HotelWebApplication.controller;

import com.blueocn.HotelWebApplication.model.Room;
import com.blueocn.HotelWebApplication.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public String getAllRooms(Model model) {
        List<Room> allRooms = roomService.getAllRooms();
        model.addAttribute("rooms", allRooms);
        return "rooms/rooms";
    }

}
