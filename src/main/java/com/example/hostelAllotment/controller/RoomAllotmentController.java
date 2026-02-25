package com.example.hostelAllotment.controller;

import com.example.hostelAllotment.model.dto.AllotmentDto;
import com.example.hostelAllotment.service.RoomAllotmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class RoomAllotmentController {

        @Autowired
        private RoomAllotmentService roomAllotmentService;

        @GetMapping("/allallotments")
        public List<AllotmentDto> getAllAllotments() {
            return roomAllotmentService.getAllotments();
        }

        @PutMapping("/createAllotment")
        public ResponseEntity<Object> createAllotment(@RequestBody AllotmentDto allotmentDto) {
            roomAllotmentService.createAllotment(allotmentDto);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }

//        @PostMapping("/updateAllotment/{id}/{status}")
//        public ResponseEntity<Object> updateAllotment(@PathVariable Integer id, @PathVariable String status) {
//            roomAllotmentService.updateAllotment(id, status);
//            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//        }

        @DeleteMapping("/deleteAllotment/{id}")
        public ResponseEntity<Object> deleteAllotment(@PathVariable Integer id) {
            roomAllotmentService.deleteAllotment(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
}
