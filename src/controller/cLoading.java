package controller;
import view.vLoading;

public class cLoading {
    private vLoading view;

    public cLoading(vLoading view) {
        this.view = view;
    }

    public void startLoading() {
        view.setVisible(true);
        
        // Simulate a time-consuming task (e.g., loading data)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        view.dispose(); // Close the loading form
    }
}

