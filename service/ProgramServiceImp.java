package com.hero_vired.programs_api.service;

import com.hero_vired.programs_api.entity.Program;
import com.hero_vired.programs_api.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProgramServiceImp implements ProgramService {

    @Autowired
    private ProgramRepository programRepository;

    @Override
    public Program createProgram(Program program) {
        return programRepository.save(program);
    }

    @Override
    public List<Program> getAllPrograms() {
        return programRepository.findAll();
    }

    @Override
    public Optional<Program> getProgramById(Long id) {
        return Optional.ofNullable(programRepository.findById(id).orElse(null));
    }

    @Override
    public Program updateProgram(Program program) {
        return programRepository.save(program);
    }

    @Override
    public void deleteProgram(Long id) {
        programRepository.deleteById(id);
    }
}
