package pt.com.cnab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.com.cnab.model.TransacaoCNAB;

public interface CnabRepository extends JpaRepository<TransacaoCNAB, Long> {
}
