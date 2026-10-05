package org.com.application.service.custom.supplier;


import org.com.application.dto.SparePart.SparePartDTO;
import org.com.application.dto.Supplier.SupplierDTO;
import org.com.application.service.SuperService;

import java.util.List;

public interface SupplierService extends SuperService<SupplierDTO> {
    void updateSuppliedSpareParts(String supplierID, List<String> partIDs) throws Exception;
    List<SparePartDTO> getSuppliedSpareParts(String supplierID) throws Exception;
}

