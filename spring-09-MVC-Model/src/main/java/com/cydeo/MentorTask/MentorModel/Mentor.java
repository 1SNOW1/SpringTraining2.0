package com.cydeo.MentorTask.MentorModel;

import com.cydeo.MentorTask.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mentor {

    private String name;
    private String lastName;
    private Gender gender;
    private int age;

}
