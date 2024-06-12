package com.hero_vired.programs_api.service;

import com.hero_vired.programs_api.entity.Program;

import java.util.List;
import java.util.Optional;

public interface ProgramService {

    Program createProgram(Program program);

    List<Program> getAllPrograms();

    Optional<Program> getProgramById(Long id);

    Program updateProgram(Program program);

    void deleteProgram(Long id);
}
