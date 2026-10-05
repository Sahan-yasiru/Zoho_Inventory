package org.com.application.repo.Supplier;

import org.com.application.entity.Supplier.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, String> {

    boolean existsByEmail(String email);

    boolean existsByPhone(int phoneNumber);

}
