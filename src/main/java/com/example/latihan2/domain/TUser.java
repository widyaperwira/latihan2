package com.example.latihan2.domain;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "T_USER")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TUser {

	@Id
    @Column(nullable = false)
    private String username;

	@Column(name = "email")
    private String email;
    
	@Column(name = "craetedDate")
    private Date createdDate;
	
	public String getUsername() {
		return this.username;
	}
}
