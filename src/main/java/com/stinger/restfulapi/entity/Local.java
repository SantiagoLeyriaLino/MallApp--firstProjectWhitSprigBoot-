package com.stinger.restfulapi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "locals")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Local {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "Name is required")
    private String name;
    private String floor;
    @Length(min = 4, max = 10, message = "min length is 4 and max length is 10")
    private String code;
}
