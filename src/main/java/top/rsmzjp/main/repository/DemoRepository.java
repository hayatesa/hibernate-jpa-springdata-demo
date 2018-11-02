package top.rsmzjp.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import top.rsmzjp.main.domain.DemoEntity;
import top.rsmzjp.main.repository.custom.DemoRepositoryCustom;

import java.util.List;

public interface DemoRepository extends JpaRepository<DemoEntity, String>, DemoRepositoryCustom {

    @Query("from DemoEntity d where d.dName =:name")
    List<DemoEntity> findByName(@Param(value = "name") String name);
}
