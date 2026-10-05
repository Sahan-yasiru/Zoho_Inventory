package org.com.application.entity.sparepart;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.com.application.entity.Brand;
import org.com.application.entity.Category;
import org.com.application.entity.Supplier.Supplier;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class SparePart {

    @Id
    private String partID;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "image_id")
    private Img image;


    @ManyToMany
    @JoinTable(
            name = "spare_part_supplier",
            joinColumns = @JoinColumn(name = "part_id"),
            inverseJoinColumns = @JoinColumn(name = "supplier_id")
    )
    private List<Supplier> suppliers;

    @ManyToOne
    @JoinColumn(name = "brandID")
    @OnDelete(action = OnDeleteAction.SET_NULL)
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "categoryID")
    @OnDelete(action = OnDeleteAction.SET_NULL)
    private Category category;

    private String partName;
    private double costPrice;
    private double sellPrice;

}
