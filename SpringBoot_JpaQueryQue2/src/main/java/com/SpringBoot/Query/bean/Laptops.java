package com.SpringBoot.Query.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Tbl_Laptops")
public class Laptops {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String description;
private String brand;
private double price;
@Override
public String toString() {
	return "Laptops [id=" + id + ", name=" + name + ", description=" + description + ", brand=" + brand + ", price="
			+ price + "]";
}

}
