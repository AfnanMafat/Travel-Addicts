package com.travel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.travel.model.Booking;
import com.travel.model.User;
import com.travel.service.Booking_Service;
import com.travel.service.User_Service;

@Controller
@SessionAttributes({ "user", "booking" })
public class User_Controller {

	@Autowired
	User_Service user_Service;

	@Autowired
	Booking_Service booking_Service;

	@GetMapping("/")
	public String HomePage() {
		return "homePage";
	}

	@GetMapping("/booking")
	public String LoginPage() {
		return "loginPage";
	}

	@GetMapping("/login")
	public String CheckLogin() {
		return "login";
	}

	@PostMapping("/login")
	public String CheckLogin(@RequestParam String email, @RequestParam String password, Model model) {

		User Find = user_Service.Validate_User(email);

		if ((Find == null) == true) {
			return "loginPage";
		}

		if ((Find.getPassword()).equals(password) == false) {
			return "loginPage";
		}

		model.addAttribute("user", Find);

		return "redirect:home";
	}

	@GetMapping("/home")
	public String Home() {
		return "home";
	}

	@GetMapping("/logout")
	public String LogOut() {
		return "redirect:/";
	}

	@GetMapping("/SignUp")
	public String SignUp(Model model) {
		model.addAttribute("user", new User());
		return "SignUp";
	}

	@PostMapping("/SignUp")
	public String SignUp(User user) {
		user_Service.Add_User(user);
		return "loginPage";
	}

	@GetMapping("/bookingPage")
	public String Book(Model model) {
		model.addAttribute("booking", new Booking());
		return "bookingPage";
	}

	@PostMapping("/bookingPage")
	public String Book(Booking booking, Model model) {

		booking_Service.SaveBooking(booking);

		model.addAttribute("booking", booking);

		return "redirect:Confirmation";
	}

	@GetMapping("/Confirmation")
	public String Confirm() {
		return "Confirmation";
	}

	@GetMapping("/forgot-password")
	public String ForgotPassword(Model model) {

		User u = (User) model.getAttribute("user");
		model.addAttribute("user", u);
		return "forgot-password";

	}

	@GetMapping("/Gujarat")
	public String Gujarat() {
		return "Gujarat";
	}

	@GetMapping("/Kanagawa")
	public String Kanagawa() {
		return "Kanagawa";
	}

	@GetMapping("/Paris")
	public String Paris() {
		return "Paris";
	}

	@GetMapping("/Cologne")
	public String Cologne() {
		return "Cologne";
	}

	@GetMapping("/Dubai")
	public String Dubai() {
		return "Dubai";
	}

	@GetMapping("/NewYork")
	public String NewYork() {
		return "NewYork";
	}

	@GetMapping("/PortBlair")
	public String PortBlair() {
		return "PortBlair";
	}

	@GetMapping("/Rome")
	public String Rome() {
		return "Rome";
	}

}
