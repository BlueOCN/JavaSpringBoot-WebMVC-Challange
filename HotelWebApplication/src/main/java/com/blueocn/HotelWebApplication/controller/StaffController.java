package com.blueocn.HotelWebApplication.controller;

import com.blueocn.HotelWebApplication.model.Staff;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController {

    private static final long TOTAL_STAFF = 10;
    private static final List<Staff> STAFFLIST = new ArrayList<>();
    static {
        for (int i = 1; i <= TOTAL_STAFF; i++) {
            STAFFLIST.add(
                    new Staff("" + i,
                            "FirstName " + i,
                            "LastName " + i,
                            "Position " + i)
            );
        }
    }

    @GetMapping
    public String getAllStaff(Model model) {
        model.addAttribute("staff", STAFFLIST);
        return "staff/staff";
    }

}
