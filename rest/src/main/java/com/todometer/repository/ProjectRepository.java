package com.todometer.repository;

import com.todometer.model.Project;
import com.todometer.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Miguel Tortosa Calabuig
 */
@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{

}
