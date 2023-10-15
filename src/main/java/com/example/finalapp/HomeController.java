package com.example.finalapp;

import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.fxml.FXMLLoader;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.Objects;
import java.util.ResourceBundle;
import java.net.URL;

import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import static javafx.application.Platform.*;

public class HomeController implements Initializable {

        public Slider songSlider;
        @FXML
        private Button AlbumsButton;
        @FXML
        private Button FavouritesButton;
        @FXML
        private Button GenreButton;
        @FXML
        private Button HomeButon;
        @FXML
        private Button Mrtambourineman;
        @FXML
        private Button Nownowplaying;
        @FXML
        private Button PlaylistsButton;
        @FXML
        private TextField SearchButton;
        @FXML
        private Button abba;
        @FXML
        private Button alagaasaman;
        @FXML
        private Button bemybaby;
        @FXML
        private Button blackcatcher;
        @FXML
        private Button dancingqueen;
        @FXML
        private Button goNext;
        @FXML
        private Button goback;
        @FXML
        private Button killerqueen;
        @FXML
        private Button radiogagag;
        @FXML
        private Button redrighthand;
        @FXML
        private Button runningonempty;
        @FXML
        private Button startButton;
        @FXML
        private Button uptowngirl;
        @FXML
        private Button wakandaforever;
        @FXML
        private Button ExitButton;

        public void GoToPlaylist(ActionEvent event) {
                try {
                        Object root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("playlist.fxml")));
                        Scene scene = new Scene((Parent) root);
                        Stage playlistStage = new Stage();
                        playlistStage.initStyle(StageStyle.UNDECORATED);
                        playlistStage.show();

                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
        }

        public void GoToHome(ActionEvent event) {
                try {
                        Object root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Home_Page.fxml")));
                        Scene scene = new Scene((Parent) root);
                        Stage HomePageStage = new Stage();
                        HomePageStage.setScene(scene);
                        HomePageStage.show();
                        HomePageStage.setResizable(false);
                        HomePageStage.setTitle("Aura");

                } catch (IOException e) {
                        throw new RuntimeException(e);
                }

        }

        public void GoToAlbums(ActionEvent event) {
                try {
                        Object root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Album.fxml")));
                        Scene scene = new Scene((Parent) root);
                        Stage HomePageStage = new Stage();
                        HomePageStage.setScene(scene);
                        HomePageStage.show();
                        HomePageStage.setResizable(false);
                        HomePageStage.setTitle("Aura");

                } catch (IOException e) {
                        throw new RuntimeException(e);
                }

        }


        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {

        }


        public void onExitApp(ActionEvent event) {

                Stage exitstage = (Stage) ExitButton.getScene().getWindow();
                exit();
        }
}

