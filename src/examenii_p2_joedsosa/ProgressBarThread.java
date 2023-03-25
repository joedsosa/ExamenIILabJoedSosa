
package examenii_p2_joedsosa;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class ProgressBarThread extends Thread {
    private JProgressBar progressBar;
    private Deporte deporte;

    public ProgressBarThread(JProgressBar progressBar, Deporte deporte) {
        this.deporte=deporte;
        this.progressBar = progressBar;
        
    }

    public void run() {
         int tiempo = deporte.getTorneos().size() * 7;
        progressBar.setMaximum(tiempo);
        int i = 0;
        while (i <= tiempo) {
            i++;
            progressBar.setStringPainted(true);
            progressBar.setValue(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProgressBarThread.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        JOptionPane.showMessageDialog(null,"SAVED!");
        progressBar.setValue(0);
        
}
}
