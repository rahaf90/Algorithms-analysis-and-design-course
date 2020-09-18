
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

public class Brute_force {

    static Highlighter.HighlightPainter HI = new Highlight(Color.YELLOW);

    public static int Search(JTextComponent txtcomp, String pat) {
        txtcomp.getHighlighter().removeAllHighlights();
        String txt = txtcomp.getText();
        int txtLen = txt.length();
        int patLeng = pat.length();
        int counter = 0;
        for (int i = 0; i < txtLen - patLeng; i++) {
            if (pat.equals(txt.substring(i, i + patLeng))) {

                try {
                    Highlighter hili = txtcomp.getHighlighter();
                    Document doc = txtcomp.getDocument();
                    hili.addHighlight(i, patLeng + i, HI);
                    counter++;
                } catch (BadLocationException ex) {
                    ex.printStackTrace();
                }

            }
        }
        return counter;
    }

}
