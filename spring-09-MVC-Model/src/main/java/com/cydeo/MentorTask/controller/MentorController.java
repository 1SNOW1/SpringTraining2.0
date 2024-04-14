package com.cydeo.MentorTask.controller;

import com.cydeo.MentorTask.Gender;
import com.cydeo.MentorTask.MentorModel.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MentorController {

    @RequestMapping("/mentor-list")
    public String HomePage(Model model){
        Mentor mentorTask1 = new Mentor("Enes", "Orhan", Gender.MALE, 22);
        Mentor mentorTask2 = new Mentor("Gizem", "Orhan", Gender.FEMALE, 23);
        Mentor mentorTask3 = new Mentor("Kubra", "Orhan", Gender.FEMALE, 16);
        Mentor mentorTask4 = new Mentor("Furkan", "Orhan", Gender.MALE, 11);

        model.addAttribute("Mentor1", mentorTask1);
        model.addAttribute("Mentor2", mentorTask2);
        model.addAttribute("Mentor3", mentorTask3);
        model.addAttribute("Mentor4", mentorTask4);


        return "/MentorTask/mentorHomePage";
    }
}
