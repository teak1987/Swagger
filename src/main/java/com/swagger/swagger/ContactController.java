package com.swagger.swagger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class ContactController {

	ConcurrentMap<Integer, Contact> contacts = new ConcurrentHashMap<>();
	
	@GetMapping("/{id}")
	@ApiOperation(value = "Finds Contact By Id",
	              notes = "Provide an id to look up specific contact",
	              response = Contact.class)
	public Contact getContact(@PathVariable Integer id) {
		return contacts.get(id);
	}
	
	@GetMapping("/")
	@ApiOperation(value = "Finds All Contacts",
    notes = "Provide an easy way to look up in all contacts",
    response = Contact.class)
	public List<Contact> getAllContacts(){
		return new ArrayList<Contact>(contacts.values());
	}
	
	@PostMapping("/")
	@ApiOperation(value = "Adding Contacts",
    notes = "Provide a simple way to crete new contact",
    response = Contact.class)
	public Contact addContact(@RequestBody Contact contact) {
		contacts.put(contact.getId(), contact);
		return contact;
	}
}
