package repository;

import com.ipiecoles.java.java230.model.Employe;
import org.springframework.data.repository.CrudRepository;

public interface EmployeRepository extends CrudRepository<Employe,Integer> {
}
