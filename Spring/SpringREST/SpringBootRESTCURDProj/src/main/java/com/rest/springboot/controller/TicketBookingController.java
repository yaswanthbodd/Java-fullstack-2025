package com.rest.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.springboot.entities.Ticket;
import com.rest.springboot.service.TicketBookingService;

@RestController
@RequestMapping( value = "/api/tickets")
public class TicketBookingController {
	@Autowired
	private TicketBookingService ticketBookingService;
	
	@PostMapping(value = "/create") // http://localhost:8081/api/tickets/create
	public Ticket createTicket(@RequestBody Ticket ticket) { 
		return ticketBookingService.createTicket(ticket);
	}
	
	@GetMapping(value = "/ticket/{ticketId}") // http://localhost:8081/api/tickets/ticket/1
	public Ticket getTicketById(@PathVariable("ticketId")Integer ticketId) {
		return ticketBookingService.getTicketById(ticketId);
	}
	
	@GetMapping( value = "/ticket/alltickets") //http://localhost:8082/api/tickets/ticket/alltickets
	public List<Ticket> getAllBookedTickets(){
		return ticketBookingService.getAllBookedTickets();
	}
	
	@DeleteMapping(value = "/ticket/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId")Integer ticketId) {
		ticketBookingService.deleteTicket(ticketId);
	}
	
	@PutMapping(value = "/ticket/{ticketId}/{newEmail:.+}") // http://localhost:8083/api/tickets/ticket/3/sai_new@gmail.com
	public Ticket updateTicket(@PathVariable("ticketId")Integer ticketId,@PathVariable("newEmail")String newEmail) {
		return ticketBookingService.updateTicket(ticketId, newEmail);
	}
}
