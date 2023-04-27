package com.AKM.Order.Model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@Entity
@Table(name = "customer_details")
public class CustomerDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(columnDefinition = "customer_name")
    private String customerName;

    @Column(columnDefinition = "age")
    private String age;

    @Column(columnDefinition = "phone_number")
    private Integer phoneNumber;
}
