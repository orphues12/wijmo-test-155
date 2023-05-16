package wijmotestv.domain;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import wijmotestv.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "departments",
    path = "departments"
)
public interface DepartmentRepository
    extends PagingAndSortingRepository<Department, Long> {
    List<Department> findByName(String name);
}
