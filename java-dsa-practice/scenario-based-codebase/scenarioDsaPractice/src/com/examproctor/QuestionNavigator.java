package com.examproctor;

import java.util.Stack;

public class QuestionNavigator {
	    private Stack<Integer> stack = new Stack<>();

	    public void visit(int qId) {
	        stack.push(qId);
	    }
	}
