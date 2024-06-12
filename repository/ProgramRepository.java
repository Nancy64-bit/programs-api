package com.hero_vired.programs_api.repository;

import com.hero_vired.programs_api.entity.Program;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramRepository extends JpaRepository<Program, Long> {
}
