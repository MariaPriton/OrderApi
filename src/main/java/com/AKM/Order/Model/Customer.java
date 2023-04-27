package com.AKM.Order.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {

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

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "id", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    @OrderBy("activeLoanId")
    @Fetch(value = FetchMode.SUBSELECT)
    private CustomerDetails customerDetails;


}
