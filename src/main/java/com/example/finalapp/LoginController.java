package com.example.finalapp;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
import java.sql.Statement;
import java.util.Objects;

public class LoginController {    // if the image is not showing then add here " implements Initializable "  then un comment all the commented stuff that starts with @FXML and also contains @Overrides

    @FXML
    private Button cancelButton;
    @FXML
    private Label loginMessageLable;
    @FXML
    private TextField usernameTextfield;
    @FXML
    private PasswordField passwordTextField;


//    @FXML
//    private ImageView brandingImageView;
//
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle){
//        File brandingFile = new File("Images/BG.jpg");
//        Image brandingImage = new Image(brandingFile.toURI().toString());
//        brandingImageView.setImage(brandingImage);
//    }


    public void loginButtonOnAction(ActionEvent event) {


        if (usernameTextfield.getText().isBlank() == false && passwordTextField.getText().isBlank() == false) {

            validateLogin();

        } else {

            loginMessageLable.setText("Please Enter Your UserName and Password");

        }
    }

    public void cancelButtonOnAction(ActionEvent event) {

        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
        Platform.exit();
        // in the above two lines of code a new object called stage is given the value of the cancelButton's scene and window which is type casted to a Stage ....then that stage is closed

    }

    public void switchToSignup(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("SignUp.fxml")));
        Stage signupstage = new Stage();
        signupstage.initStyle(StageStyle.UNDECORATED);
        signupstage.setScene(new Scene(root));
        signupstage.show();

    }


    public void validateLogin() {

        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String verifyLogin = "SELECT count(1) FROM aura.user_account WHERE username = '" + usernameTextfield.getText() + "' AND Password = '" + passwordTextField.getText() + "'";

        try {

            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            while (queryResult.next()) {
                if (queryResult.getInt(1) == 1) {

                    Object root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Home_Page.fxml")));
                    Scene scene = new Scene((Parent) root);
                    Stage HomePageStage = new Stage();
                    HomePageStage.setScene(scene);
                    HomePageStage.show();
                    HomePageStage.setResizable(false);
                    HomePageStage.setTitle("Aura");

                } else {
                    loginMessageLable.setText("Invalid username or password. Please try again");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }

    /*public void loginButtonOnAction(ActionEvent event) {
        try {
            Object root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Home_Page.fxml")));
            Scene scene = new Scene((Parent) root);
            Stage HomePageStage = new Stage();
            HomePageStage.setScene(scene);
            HomePageStage.show();
            HomePageStage.setResizable(false);
            HomePageStage.setTitle("Aura");

        } catch (IOException e) {
            throw new RuntimeException(e);*/
}

