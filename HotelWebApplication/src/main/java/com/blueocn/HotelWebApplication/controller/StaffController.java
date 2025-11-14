package com.blueocn.HotelWebApplication.controller;

import com.blueocn.HotelWebApplication.model.Staff;
import com.blueocn.HotelWebApplication.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController {

    private final StaffService staffService;

    @Autowired
    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public String getAllStaff(Model model) {
        List<Staff> allStaff = staffService.getAllStaff();
        model.addAttribute("staff", allStaff);
        return "staff/staff";
    }

}
