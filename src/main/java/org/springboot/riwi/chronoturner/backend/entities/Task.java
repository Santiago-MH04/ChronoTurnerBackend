package org.springboot.riwi.chronoturner.backend.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springboot.riwi.chronoturner.backend.utils.enumGoal.StatusGoal;
import org.springboot.riwi.chronoturner.backend.utils.taskEnums.enumSubTask.StatusSubTask;
import org.springboot.riwi.chronoturner.backend.utils.taskEnums.enumTask.StatusTask;

import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Task {
        //Atributos de Task
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(nullable = false)
    private String name;
    /*@Column(nullable = false)*/   //Si no, habrá problemos con el DTO
    private String description;
    @Column(nullable = false)
    private LocalDateTime expirationDate;
    @Enumerated(EnumType.STRING)
    private StatusTask statusTask;  //Revisar entre todos la pertinencia de este atributo, lo veo innecesario
    @Enumerated(EnumType.STRING)
    private StatusSubTask statusSubTask;
    @ManyToOne  //Corregir cardinalidad
    @JoinColumn(name = "priority_id")
    private Priority priorityEntity;    //Una Task, una Priority
    @ManyToOne
    @JoinColumn(name = "goal_id")
    private Goal goalEntity;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category categoryEntity;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userEntity;

    //Constructores de Task
    //Asignadores de atributos de Task (setters)
    //Lectores de atributos de Task (getters)
        //Métodos de Task
    @PrePersist
    public void taskCreation() {
        this.statusTask = StatusTask.INITIATED;
    }

}
