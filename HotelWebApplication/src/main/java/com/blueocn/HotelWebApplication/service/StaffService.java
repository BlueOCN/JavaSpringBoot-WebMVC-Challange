package com.blueocn.HotelWebApplication.service;

import com.blueocn.HotelWebApplication.model.Position;
import com.blueocn.HotelWebApplication.model.Staff;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {

    private static final long TOTAL_STAFF = 10;
    private static final List<Staff> STAFFLIST = new ArrayList<>();
    static {
        STAFFLIST.addAll(List.of(
                new Staff(UUID.randomUUID().toString(), "John1", "Doe1", Position.HOUSEKEEPING),
                new Staff(UUID.randomUUID().toString(), "John2", "Doe2", Position.FRONT_DESK),
                new Staff(UUID.randomUUID().toString(), "John3", "Doe3", Position.SECURITY),
                new Staff(UUID.randomUUID().toString(), "John4", "Doe4", Position.CONCIERGE)
        ));
    }

    public List<Staff> getAllStaff() {
        return STAFFLIST;
    }
}
