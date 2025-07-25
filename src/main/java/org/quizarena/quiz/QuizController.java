package org.quizarena.quiz;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class QuizController {

    @PostMapping("/start")
    public QuizResponse startQuiz(@RequestBody PlayerEntity player) {
        String url = "https://opentdb.com/api.php?amount=" + player.getQuestionAmount()
                + "&type=" + player.getQuestionType();

        RestTemplate restTemplate = new RestTemplate();
        QuizResponse response = restTemplate.getForObject(url, QuizResponse.class);

        System.out.println("Player: " + player.getFullName() + " | Age: " + player.getAge());
        return response;
    }
}
