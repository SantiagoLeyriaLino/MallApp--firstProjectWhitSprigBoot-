package com.stinger.restfulapi.repository;

import com.stinger.restfulapi.entity.Local;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LocalRepository extends JpaRepository<Local,Long> {
    //@Query("SELECT l FROM Local l WHERE l.name = :name")
  // Optional<Local> findLocalByNameWithJPQL(String name);

    Optional<Local> findLocalByNameIgnoreCase(String name);
}
