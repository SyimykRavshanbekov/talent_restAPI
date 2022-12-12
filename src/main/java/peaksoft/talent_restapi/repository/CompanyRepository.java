package peaksoft.talent_restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import peaksoft.talent_restapi.entities.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
