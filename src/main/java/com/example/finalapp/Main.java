package com.example.finalapp;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Slider;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.StageStyle;

import java.util.Timer;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("SignIn.fxml"))); //pass scene name here
            primaryStage.initStyle(StageStyle.UNDECORATED);  // this .initStyle(StageStyle.UNDECORATED) makes the clos minimize maximize bar to dissapear
            primaryStage.setScene(new Scene(root));
            primaryStage.show(); // set title of app



    }


    public static class Song implements Initializable {

        @FXML
        private Button runningonempty;
        @FXML
        private Button startButton,goNext,goback;
        @FXML
        private Button uptowngirl;
        @FXML
        private Button wakandaforever;
        @FXML
        private Button dancingqueen;
        @FXML
        private Button killerqueen;
        @FXML
        private Button radiogagag;
        @FXML
        private Button redrighthand;
        @FXML
        private Button Mrtambourineman;
        @FXML
        private Button abba;
        @FXML
        private Button alagaasaman;
        @FXML
        private Button bemybaby;
        @FXML
        private Button blackcatcher;
        @FXML
        private Button Nownowplaying;
        @FXML
        private Slider songSlider;

    private File directory;
    private File[] files;
    private ArrayList<File> songs;
    private int songNumber;
    private Timer timer;


        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
            
        }
    }

    public static void main(String[] args) {
        launch();
    }
}