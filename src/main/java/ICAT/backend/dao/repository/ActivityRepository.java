package ICAT.backend.dao.repository;

import ICAT.backend.pojo.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: OY
 * @date: 13:27 2019/11/30
 */
public interface ActivityRepository extends JpaRepository<Activity,String> {
}
