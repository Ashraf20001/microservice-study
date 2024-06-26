package com.eazybites.accounts.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEntity extends BasePredicate{
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long customerId;
		
		private String name;
		
		private String email;
		
		private String mobileNumber;
}
