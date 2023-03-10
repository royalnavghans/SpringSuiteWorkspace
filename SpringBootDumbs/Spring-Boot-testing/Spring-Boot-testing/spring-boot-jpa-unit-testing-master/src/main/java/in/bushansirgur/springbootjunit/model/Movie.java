package in.bushansirgur.springbootjunit.model;


import java.time.LocalDate;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.Table;


import lombok.AllArgsConstructor;

import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_movies")

public class Movie {
	
@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
	
private Long id;	
public Long getId() {
		
    return id;
	}
	
public void setId(Long id) 
{
	this.id = id;
	
}

public String getName() {

	return name;
	}

public void setName(String name) {
		
    this.name = name;
}
 	
public String getGenera() {
		
return genera;

	}

public void setGenera(String genera) {
		
this.genera = genera;
	
}

public LocalDate getReleaseDate() {
		
return releaseDate;
	
}
	
public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;

	}
	
private String name;
private String genera;
private LocalDate releaseDate;

}
