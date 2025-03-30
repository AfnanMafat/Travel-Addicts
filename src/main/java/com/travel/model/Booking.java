package com.travel.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "booking")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "no")
	private int no;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private long phone;
	
	@Column(name = "age")
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Column(name = "gender")
	private String gender;
	
	@Column(name = "departure")
	private String departure;
	
	@Column(name = "returndate")
	private String returndate;
	
	@Column(name = "destination")
	private String destination;
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(String name, String email, long phone, int age, String gender, String departure, String returndate,
			String destination, String travelPacakge) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.gender = gender;
		this.departure = departure;
		this.returndate = returndate;
		this.destination = destination;
		this.travelPacakge = travelPacakge;
	}

	@Override
	public String toString() {
		return "booking [no=" + no + ", name=" + name + ", email=" + email + ", phone=" + phone + ", age=" + age
				+ ", gender=" + gender + ", departure=" + departure + ", returndate=" + returndate + ", destination="
				+ destination + ", Pacakge=" + travelPacakge + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getReturndate() {
		return returndate;
	}

	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getTravelPacakge() {
		return travelPacakge;
	}

	public void setTravelPacakge(String travelPacakge) {
		this.travelPacakge = travelPacakge;
	}

	@Column(name = "package")
	private String travelPacakge;
	
}
