package zw.co.afrosoft.vaccinationcenter.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.afrosoft.vaccinationcenter.domain.VaccinationCenter;

public interface VaccinationCenterRepository extends JpaRepository<VaccinationCenter, Long> {
}
