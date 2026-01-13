package com.texteditor;

public class TextEditorAap {
	public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.insertText("This is a scenario based problem", 0);
        editor.insertText(" Dsa-Problem ", 5);
        editor.display();

        editor.deleteText(5, 6);
        editor.display();

        editor.undo();
        editor.display();

        editor.redo();
        editor.display();
    }
}