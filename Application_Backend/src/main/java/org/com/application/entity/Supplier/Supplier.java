package org.com.application.entity.Supplier;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Supplier {
    @Id
    private String supplierID;
    private String name;

    @Column(unique = true)
    private int phone;

    @Column(unique = true)
    private String email;

}
