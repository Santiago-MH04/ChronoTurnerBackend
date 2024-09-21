package org.springboot.riwi.chronoturner.backend.Service.impl;

import org.springboot.riwi.chronoturner.backend.repositories.GoalRepository;
import org.springboot.riwi.chronoturner.backend.Service.interfaces.IGoalService;

import org.springboot.riwi.chronoturner.backend.dtos.request.GoalRequest;
import org.springboot.riwi.chronoturner.backend.dtos.response.GoalResponse;
import org.springboot.riwi.chronoturner.backend.entities.Goal;
import org.springboot.riwi.chronoturner.backend.utils.enumGoal.StatusGoal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GoalImpl implements IGoalService {
    @Autowired
    GoalRepository goalRepository;


    @Override
    public Goal create(GoalRequest goalDTO) {
          //DTO --> entidad
        Goal request = new Goal().builder().name(goalDTO.getName())
                .description(goalDTO.getDescription())
                .startDate(goalDTO.getStartDate())
                .endDate(goalDTO.getEndDate())
                .build();
        return goalRepository.save(request);
    }

    @Override
    public Optional<GoalResponse> readById(String id) {
          // mapeo entidad -> Entidad de respuesta
        return goalRepository.findById(id)
                .map(goal-> new GoalResponse().builder()
                .name(goal.getName())
                .description(goal.getDescription())
                .startDate(goal.getStartDate())
                .endDate(goal.getEndDate())
                .status(goal.getStatus())
                .build()) ;
    }

    @Override
    public Optional<List<GoalResponse>> readAll() {
        List<GoalResponse> list= goalRepository.findAll().stream()
                .map(goal -> new GoalResponse().builder()
                        .name(goal.getName())
                        .description(goal.getDescription())
                        .startDate(goal.getStartDate())
                        .endDate(goal.getEndDate())
                        .status(goal.getStatus())
                        .build()).collect(Collectors.toList());
        return Optional.ofNullable(list);
    }

    @Override
    public void delete(GoalResponse goalResponse,String id) {
          //DTO -> GOAL(Entity)
        Goal goal= new Goal().builder()
                .name(goalResponse.getName())
                .description(goalResponse.getDescription())
                .startDate(goalResponse.getStartDate())
                .endDate(goalResponse.getEndDate())
                .status(goalResponse.getStatus())
                .build();

          //set id
        goal.setId(id);
        goalRepository.delete(goal);
    }


    @Override
    public void put(GoalRequest goalRequest, String s,GoalResponse goalResponse) {
        Goal goal= new Goal().builder()
                .name(goalRequest.getName())
                .description(goalRequest.getDescription())
                .startDate(goalRequest.getStartDate())
                .endDate(goalRequest.getEndDate())
                .build();
        goal.setId(s);
          // Aquí hay que tener encuenta la lógica de las tareas
        goal.setStatus(StatusGoal.COMPLETED);
          //setiando con los valores de la respuesta
        if(goal.getName()==null){
            goal.setName(goalResponse.getName());
        }
        if(goal.getDescription()==null){
            goal.setDescription(goalResponse.getDescription());
        }
        if(goal.getStartDate()==null){
            goal.setStartDate(goalResponse.getStartDate());
        }
        if(goal.getEndDate()==null){
            goal.setEndDate(goalResponse.getEndDate());
        }
        goalRepository.save(goal);
    }

}
