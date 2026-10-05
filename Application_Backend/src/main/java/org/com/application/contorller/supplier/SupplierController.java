package org.com.application.contorller.supplier;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.com.application.dto.SparePart.SparePartDTO;
import org.com.application.dto.Supplier.SupplierDTO;
import org.com.application.service.custom.supplier.SupplierService;
import org.com.application.util.APIResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    private final SupplierService supplierService;

    @GetMapping
    public ResponseEntity<APIResponse<List<SupplierDTO>>> getAllSuppliers() throws Exception {
        return ResponseEntity.ok(new APIResponse<>(200, "Suppliers retrieved successfully", supplierService.getAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<APIResponse<SupplierDTO>> getSupplier(@PathVariable String id) throws Exception {
        return ResponseEntity.ok(new APIResponse<>(200, "Supplier retrieved successfully", supplierService.find(id)));
    }

    @PostMapping
    public ResponseEntity<APIResponse<SupplierDTO>> saveSupplier(@RequestBody @Valid SupplierDTO dto) throws Exception {
        System.out.println(dto);
        return ResponseEntity.ok(new APIResponse<>(200, "Supplier created successfully", supplierService.save(dto)));
    }

    @PutMapping
    public ResponseEntity<APIResponse<SupplierDTO>> updateSupplier(@RequestBody @Valid SupplierDTO dto) throws Exception {
        return ResponseEntity.ok(new APIResponse<>(200, "Supplier updated successfully", supplierService.update(dto)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<APIResponse<Void>> deleteSupplier(@PathVariable String id) throws Exception {
        supplierService.delete(id);
        return ResponseEntity.ok(new APIResponse<>(200, "Supplier deleted successfully", null));
    }

    @GetMapping("/{id}/spare-parts")
    public ResponseEntity<APIResponse<List<SparePartDTO>>> getSuppliedSpareParts(@PathVariable String id) throws Exception {
        return ResponseEntity.ok(new APIResponse<>(200, "Supplied spare parts retrieved successfully", supplierService.getSuppliedSpareParts(id)));
    }

    @PutMapping("/{id}/spare-parts")
    public ResponseEntity<APIResponse<Void>> updateSuppliedSpareParts(
            @PathVariable String id,
            @RequestBody List<String> partIDs) throws Exception {
        supplierService.updateSuppliedSpareParts(id, partIDs);
        return ResponseEntity.ok(new APIResponse<>(200, "Supplied spare parts updated successfully", null));
    }
}
