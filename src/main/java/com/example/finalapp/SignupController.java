package com.example.finalapp;

import com.mysql.cj.x.protobuf.MysqlxCrud;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import java.sql.*;


public class SignupController {

    @FXML
    private TextField usernameTextField2;
    @FXML
    private PasswordField passwordTextFiedl2;
    @FXML
    private Label registerLabel;
    @FXML
    private Button CancelButton;
    @FXML
    private Button ExitButton;

    public void onRegisterAction(ActionEvent event) {

        if (usernameTextField2.getText().isBlank() == false && passwordTextFiedl2.getText().isBlank() == false) {
            validateSignUp(event);
        } else {

            registerLabel.setText("Please Enter Your UserName and Password");

        }
    }

    private void validateSignUp(ActionEvent event) {
        System.out.println("Inside function signup");
        DatabaseConnection connectnow = new DatabaseConnection();
        Connection connectdb = connectnow.getConnection();
        String verifySignup = "select count(1) from aura.user_account where username = '" + usernameTextField2.getText() +"' ";
        /*int i = mobno.getText().length();
        if (i>10 || i<10){
            errorMobNo.setText("⚠ Please enter correct mobile no!");
            mobno.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
        }*/

        try {
            Statement statement = connectdb.createStatement();
            ResultSet queryResult = statement.executeQuery(verifySignup);
            while (queryResult.next()) {
                if (queryResult.getInt(1) == 1) {
                    System.out.println("inside if");
                    registerLabel.setText("You are already a registered User");

                } else {
                    {
                        System.out.println("inside else");
                        String username = usernameTextField2.getText();
                        String password = passwordTextFiedl2.getText();

                        String insertFields = "Insert Into user_account(username , password) values ('";
                        String insertValues = username + "','" + password + "')";
                        String insertDetails = insertFields + insertValues;

                        try {
                            statement = connectdb.createStatement();
                            statement.executeUpdate(insertDetails);
                            registerLabel.setText("User registered Successfully!");

                        } catch (Exception e) {
                            e.printStackTrace();
                            e.getCause();
                        }
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void onCancelButtonAction(ActionEvent event){

            Stage stage = (Stage) CancelButton.getScene().getWindow();
            Platform.exit();
    }

    public void switchToSignIn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("SignIn.fxml")));
        Stage signinstage = new Stage();
        signinstage.initStyle(StageStyle.UNDECORATED);
        signinstage.setScene(new Scene(root));
        signinstage.show();

    }
}


