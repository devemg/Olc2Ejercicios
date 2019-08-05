/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intefaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextScrollPane;

/**
 *
 * @author Emely
 */
public class MyTab extends JPanel {

    RSyntaxTextArea textArea;
    private String path;

    public MyTab() {
        super(new BorderLayout());
        textArea = new RSyntaxTextArea(20, 60);
        textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
        textArea.setCurrentLineHighlightColor(Color.WHITE);
        textArea.setCaretColor(Color.BLACK);
        textArea.setFont(new Font("monospaced", Font.PLAIN, 16));
        RTextScrollPane sp = new RTextScrollPane(textArea);
        // this.setBounds(0, 0, (int) dim.getWidth(), (int) dim.getHeight());
        this.add(sp);
    }

    MyTab(String texto, String path) {
        super(new BorderLayout());
        textArea = new RSyntaxTextArea(20, 60);
        textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
        textArea.setCurrentLineHighlightColor(Color.WHITE);
        textArea.setCaretColor(Color.BLACK);
        textArea.setFont(new Font("monospaced", Font.PLAIN, 16));
        RTextScrollPane sp = new RTextScrollPane(textArea);
        this.add(sp);
        this.path = path;
        this.textArea.setText(texto);
    }

    String getText() {
        return textArea.getText();
    }

    boolean isEmptyText() {
        return this.textArea.getText().isEmpty();
    }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }

}
