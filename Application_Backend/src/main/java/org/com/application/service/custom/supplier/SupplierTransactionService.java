package org.com.application.service.custom.supplier;


import org.com.application.dto.Supplier.SupplierTransactionDTO;
import org.com.application.exception.CustomException;
import org.com.application.service.SuperService;

public interface SupplierTransactionService extends SuperService<SupplierTransactionDTO> {
    Long parseId(String id) throws CustomException;
}
