package org.com.application.dto.SparePart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.com.application.dto.BrandDTO;
import org.com.application.dto.CategoryDTO;
import org.com.application.dto.Supplier.SupplierDTO;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class SparePartDTO {
    private String partID;
    private DtoImg image;
    private String partName;
    private List<SupplierDTO> suppliers;
    private BrandDTO brand;
    private CategoryDTO category;
    private double costPrice;
    private double sellPrice;
}
