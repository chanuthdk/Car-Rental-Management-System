package controller;

import model.mGetCustomerNames;
import javax.swing.JComboBox;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class cGetCustomerNames {
    private mGetCustomerNames model;

    public cGetCustomerNames(mGetCustomerNames model) {
        this.model = model;
    }

    public void populateComboBox(JComboBox<String> comboBox) {
        List<String> customerNames = model.getCustomerNames();

        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(customerNames.toArray(new String[0]));
        comboBox.setModel(comboBoxModel);
    }
}

