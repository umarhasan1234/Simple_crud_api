package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.VptEmployee;

public interface UserRepository extends JpaRepository<VptEmployee,Long>{

}
