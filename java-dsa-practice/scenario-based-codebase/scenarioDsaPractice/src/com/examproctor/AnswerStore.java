package com.examproctor;

import java.util.HashMap;

public class AnswerStore {
	private HashMap<Integer, String> answers = new HashMap<>();

    public void save(int qId, String ans) {
        answers.put(qId, ans.toUpperCase());
    }

    public HashMap<Integer, String> getAnswers() {
        return answers;
    }
}