package com.examproctor;

import java.util.HashMap;

public class ScoreEvaluator {
	 private HashMap<Integer, String> correct = new HashMap<>();

	    public ScoreEvaluator() {
	        correct.put(1, "A");
	        correct.put(2, "B");
	        correct.put(3, "C");
	        correct.put(4, "C");
	        correct.put(5, "B");
	    }

	    public int evaluate(HashMap<Integer, String> student) {
	        int score = 0;

	        for (int id : correct.keySet()) {
	            if (student.containsKey(id) &&
	                student.get(id).equals(correct.get(id))) {
	                score++;
	            }
	        }
	        return score;
	    }

	    public int total() {
	        return correct.size();
	    }
	}