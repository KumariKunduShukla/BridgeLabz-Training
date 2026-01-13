package com.texteditor;

import java.util.Stack;

public class TextEditor {
	private StringBuilder content = new StringBuilder();
    private Stack<Action> undoStack = new Stack<>();
    private Stack<Action> redoStack = new Stack<>();

    // Insert operation
    public void insertText(String text, int position) {
        content.insert(position, text);
        undoStack.push(new Action("INSERT", text, position));
        redoStack.clear(); // clear redo after new action
        System.out.println("Inserted: " + text);
    }

    // Delete operation
    public void deleteText(int position, int length) {
        String deletedText = content.substring(position, position + length);
        content.delete(position, position + length);
        undoStack.push(new Action("DELETE", deletedText, position));
        redoStack.clear();
        System.out.println("Deleted: " + deletedText);
    }

    // Undo operation
    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo.");
            return;
        }

        Action action = undoStack.pop();

        if (action.type.equals("INSERT")) {
            content.delete(action.position,
                    action.position + action.text.length());
        } else if (action.type.equals("DELETE")) {
            content.insert(action.position, action.text);
        }

        redoStack.push(action);
        System.out.println("Undo performed.");
    }

    // Redo operation
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo.");
            return;
        }

        Action action = redoStack.pop();

        if (action.type.equals("INSERT")) {
            content.insert(action.position, action.text);
        } else if (action.type.equals("DELETE")) {
            content.delete(action.position,
                    action.position + action.text.length());
        }

        undoStack.push(action);
        System.out.println("Redo performed.");
    }

    // Display current content
    public void display() {
        System.out.println("Current Text: \"" + content + "\"");
    }
}