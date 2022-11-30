package pwo.user;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import pwo.products.Products;
import pwo.products.Products_template;
import pwo.discrete_knapsack_problem.Discrete_knapsack_problem;

/**
 *
 * @author Jakub Kleszko
 */
public class User extends JFrame implements ActionListener {

    String[] messageStrings = {"Pokaż wszystko", "Ręce(Pojemność 10)", "Siatka z Biedronki(Pojemność 15)", "Bagażnik samochodu(Pojemność 30)", "Ciężarówka(Pojemność 40)"};
    JComboBox cmbMessageList = new JComboBox(messageStrings);
    JTextArea lblText = new JTextArea();
    JLabel lblText2 = new JLabel();

    /**
     *
     * Utworzenie frame
     */
    public static void main(String[] args) {
        User fr = new User();
        fr.setVisible(true);
    }

    /**
     * utworzenie GUI
     */
    public User() {
        Products_template[] products = Products.set_products();
        String output = "Mozliwe do zakupu przedmioty, ich wagi oraz cena:\n\n";
        int n = products.length;
        for (int i = 0; i < n; i++) {
            output += "Nazwa: " + products[i].name + ", waga: " + products[i].weight + ", cena: " + products[i].value + "\n";
        }
        lblText.setText(output);
        setLayout(new FlowLayout());
        setSize(800, 600);
        setTitle("Znajdz oferte dla siebie!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cmbMessageList.setSelectedIndex(0);
        cmbMessageList.addActionListener(this);
        lblText2.setText("Wybierz sposób transportowania przedmiotów ze sklepu: ");
        lblText.setEditable(false);
        add(lblText2);
        add(cmbMessageList);
        add(lblText);
    }

    /**
     *
     * Po wybraniu z listy konkretnego "plecaka" nastepuje wypisanie koncowych
     * danych za pomoca switch case
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cmbMessageList) {
            JComboBox cb = (JComboBox) e.getSource();
            String msg = (String) cb.getSelectedItem();
            Products_template[] products = Products.set_products();
            String output = "Mozliwe do zakupu przedmioty, ich wagi oraz cena:\n\n";
            int n = products.length;
            int[] indexes = new int[n];
            output = "Przedmioty z najlepszym stosunkiem cena/waga:\n";
            switch (msg) {
                case "Pokaż wszystko":
                    output = "Mozliwe do zakupu przedmioty, ich wagi oraz cena:\n\n";
                    for (int i = 0; i < n; i++) {
                        output += "Nazwa: " + products[i].name + ", waga: " + products[i].weight + ", cena: " + products[i].value + "\n";
                    }
                    lblText.setText(output);
                    break;
                case "Ręce(Pojemność 10)":
                    indexes = Discrete_knapsack_problem.knapSack(10);
                    for (int i = 0; i < n; i++) {
                        if (indexes[i] != -1) {
                            output += "Nazwa: " + products[indexes[i]].name + ", waga: " + products[indexes[i]].weight + ", cena: " + products[indexes[i]].value + "\n";
                        }
                    }
                    lblText.setText(output);
                    break;
                case "Siatka z Biedronki(Pojemność 15)":
                    indexes = Discrete_knapsack_problem.knapSack(15);
                    for (int i = 0; i < n; i++) {
                        if (indexes[i] != -1) {
                            output += "Nazwa: " + products[indexes[i]].name + ", waga: " + products[indexes[i]].weight + ", cena: " + products[indexes[i]].value + "\n";
                        }
                    }
                    lblText.setText(output);
                    break;
                case "Bagażnik samochodu(Pojemność 30)":
                    indexes = Discrete_knapsack_problem.knapSack(30);
                    for (int i = 0; i < n; i++) {
                        if (indexes[i] != -1) {
                            output += "Nazwa: " + products[indexes[i]].name + ", waga: " + products[indexes[i]].weight + ", cena: " + products[indexes[i]].value + "\n";
                        }
                    }
                    lblText.setText(output);
                    break;
                case "Ciężarówka(Pojemność 40)":
                    indexes = Discrete_knapsack_problem.knapSack(40);
                    for (int i = 0; i < n; i++) {
                        if (indexes[i] != -1) {
                            output += "Nazwa: " + products[indexes[i]].name + ", waga: " + products[indexes[i]].weight + ", cena: " + products[indexes[i]].value + "\n";
                        }
                    }
                    lblText.setText(output);
                    break;
                default:
                    lblText.setText("Error :(");

            }
        }
    }
}
