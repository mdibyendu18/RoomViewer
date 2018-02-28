package com.abc.roomviewer.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.abc.roomviewer.entity.Room;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "home";
	}
	
	
	@RequestMapping("/rooms/{floorNo}")
	@ResponseBody
	public List<Room> getRoomDetails(@PathVariable("floorNo") int floorNo) {
		List<Room> rooms = new ArrayList<>();
		if(floorNo == 1) {
		    Room r1 = new Room(20, 30, 40, 40, 20);
		    Room r2 = new Room(20, 75, 40, 45, 40);
		    Room r3 = new Room(20, 125, 40, 55, 20);
		    Room r4 = new Room(20, 185, 40, 45, 20);
		    Room r5 = new Room(20, 235, 40, 45, 40);
		    Room r6 = new Room(20, 290, 40, 45, 40);
		    Room r7 = new Room(65, 50, 250, 285,80);
		    Room r8 = new Room(140, 0, 195, 170, 0);
		    Room r9 = new Room(265, 318, 50, 18, 0);
		    Room r10 = new Room(470, 0,75,105,20);
		    Room r11 = new Room(550, 0,55,40, 40);
		    Room r12 = new Room(610, 0,55,40, 40);
		    Room r13 = new Room(670, 0,55,40, 40);
		    Room r14 = new Room(730, 0,40,40, 40);
		    Room r15 = new Room(775, 0,65,40, 20);
		    Room r16 = new Room(560, 50,208,80, 40);
		    Room r17 = new Room(775, 50,65,165,80);
		    Room r18 = new Room(775, 220,65,45,80);
		    Room r19 = new Room(473, 140,135,125,80);
		    Room r20 = new Room(615, 140,153,125,80);
		    rooms.add(r1);
		    rooms.add(r2);
		    rooms.add(r3);
		    rooms.add(r4);
		    rooms.add(r5);
		    rooms.add(r6);
		    rooms.add(r7);
		    rooms.add(r8);
		    rooms.add(r9);
		    rooms.add(r10);
		    rooms.add(r11);
		    rooms.add(r12);
		    rooms.add(r13);
		    rooms.add(r14);
		    rooms.add(r15);
		    rooms.add(r16);
		    rooms.add(r17);
		    rooms.add(r18);
		    rooms.add(r19);
		    rooms.add(r20);
		    
		}else if(floorNo == 2) {
		    Room r1 = new Room(20, 30, 40, 40, 20);
		    Room r2 = new Room(20, 75, 40, 45, 40);
		    Room r3 = new Room(20, 125, 40, 55, 20);
		    Room r4 = new Room(20, 185, 40, 45, 40);
		    Room r5 = new Room(20, 235, 40, 45, 20);
		    Room r6 = new Room(20, 290, 40, 45, 40);
		    Room r7 = new Room(65, 50, 250, 285,20);
		    Room r8 = new Room(140, 0, 195, 170, 0);
		    Room r9 = new Room(265, 318, 50, 18, 0);
		    Room r10 = new Room(470, 0,75,105,40);
		    Room r11 = new Room(550, 0,55,40, 20);
		    Room r12 = new Room(610, 0,55,40, 40);
		    Room r13 = new Room(670, 0,55,40, 20);
		    Room r14 = new Room(730, 0,40,40, 40);
		    Room r15 = new Room(775, 0,65,40, 20);
		    Room r16 = new Room(560, 50,208,80, 40);
		    Room r17 = new Room(775, 50,65,165,20);
		    Room r18 = new Room(775, 220,65,45,40);
		    Room r19 = new Room(473, 140,135,125,80);
		    Room r20 = new Room(615, 140,153,125,80);
		    rooms.add(r1);
		    rooms.add(r2);
		    rooms.add(r3);
		    rooms.add(r4);
		    rooms.add(r5);
		    rooms.add(r6);
		    rooms.add(r7);
		    rooms.add(r8);
		    rooms.add(r9);
		    rooms.add(r10);
		    rooms.add(r11);
		    rooms.add(r12);
		    rooms.add(r13);
		    rooms.add(r14);
		    rooms.add(r15);
		    rooms.add(r16);
		    rooms.add(r17);
		    rooms.add(r18);
		    rooms.add(r19);
		    rooms.add(r20);
		}




	    
	    
	    return rooms;
	}
}
