package netcracker.homework.front.repository;

import netcracker.homework.front.dao.ClientDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //класс который ходит в базу данных
public interface ClientRepository extends JpaRepository<ClientDao, String> {
    List<ClientDao> findByName(@Param("name") String name);
    }
