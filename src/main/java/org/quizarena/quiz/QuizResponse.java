package org.quizarena.quiz;

import java.util.List;

public class QuizResponse {
    private int response_code;
    private List<QuizQuestion> results;

    public int getResponse_code() {
        return response_code;
    }

    public void setResponse_code(int response_code) {
        this.response_code = response_code;
    }

    public List<QuizQuestion> getResults() {
        return results;
    }

    public void setResults(List<QuizQuestion> results) {
        this.results = results;
    }
}
