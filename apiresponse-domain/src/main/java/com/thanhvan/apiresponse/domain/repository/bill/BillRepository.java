package com.thanhvan.apiresponse.domain.repository.bill;

import com.thanhvan.apiresponse.domain.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill , String> {
}
