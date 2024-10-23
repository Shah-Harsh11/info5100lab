
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author yashpatel
 */
public class Controller {

    @FXML
    TextField nameTextField;
    @FXML
    TextField ageTextField;
    @FXML
    TextField emailTextField;

    public void submit(ActionEvent event) {
        System.out.println("Submitted");
        String name = nameTextField.getText();
        var age = ageTextField.getText();
        String email = emailTextField.getText();
        if (name.isEmpty() || age.isEmpty() || email.isEmpty()) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Error");
            alert.setContentText("Fill all fields.");
            alert.showAndWait();
            return;
        }
        try {
            Integer.valueOf(age);
        } catch (NumberFormatException e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Error");
            alert.setContentText("Age must be a  number");
            alert.showAndWait();
            return;
        }
        String emailRegex ="^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (!email.matches(emailRegex)) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Error");
            alert.setContentText("Not a valid email address.");
            alert.showAndWait();
            return;
        }
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Submitted");
        alert.setHeaderText("Thank you");
        alert.setContentText("Submitted " + name + "\nAge: " + age + "\nEmail: " + email);
        alert.showAndWait();
    }
}
