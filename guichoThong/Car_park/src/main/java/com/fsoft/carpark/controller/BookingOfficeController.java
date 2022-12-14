package com.fsoft.carpark.controller;

import com.fsoft.carpark.dto.BookingOfficeDto;
import com.fsoft.carpark.model.BookingOffice;
import com.fsoft.carpark.service.IBookingOfficeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("car-park")
public class BookingOfficeController {
    private final IBookingOfficeService bookingOfficeService;

    public BookingOfficeController(IBookingOfficeService bookingOfficeService) {
        this.bookingOfficeService = bookingOfficeService;
    }

    @GetMapping("/booking-office/list")
    public ResponseEntity<List<BookingOfficeDto>> getAllBookingOffices() {
        return bookingOfficeService.getAllBookingOffices();
    }

    @GetMapping(value = "/booking-office/get/{officeId}")
    public ResponseEntity<BookingOfficeDto> getBookingOfficeById(@PathVariable("officeId") String officeId) {
        return bookingOfficeService.getBookingOfficeById(Long.parseLong(officeId));
    }

    @PostMapping(value = "/booking-office/add")
    public ResponseEntity<BookingOffice> addNewBookingOffice(@ModelAttribute BookingOfficeDto bookingOfficeDto) {
        return bookingOfficeService.addNewBookingOffice(bookingOfficeDto);
    }

    @DeleteMapping(value = "/booking-office/delete/{officeId}")
    public ResponseEntity<Map<String, Boolean>> deleteBookingOfficeById(@PathVariable("officeId") String officeId) {
        return bookingOfficeService.deleteBookingOfficeById(Long.parseLong(officeId));
    }
}
