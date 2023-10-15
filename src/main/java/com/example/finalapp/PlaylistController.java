package com.example.finalapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.fxml.Initializable;
import javafx.fxml.FXMLLoader;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.Objects;
import java.util.ResourceBundle;
import java.net.URL;
import javafx.scene.control.Hyperlink;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class PlaylistController implements Initializable{

        @FXML
        private Button AlbumsButton;

        @FXML
        private Button FavouritesButton;

        @FXML
        private Button GenreButton;

        @FXML
        private Button HomeButon;

        @FXML
        private Button PlaylistsButton;

        @FXML
        private Button aajjanekizidnakaro;

        @FXML
        private Button aapkinazronnesamjha;

        @FXML
        private Button abhinajaochhodkar;

        @FXML
        private Button ajibdastanhaiyeh;

        @FXML
        private Button ayekhuda;

        @FXML
        private Button badeacchelagtehai;

        @FXML
        private Button bahomainchaleao;

        @FXML
        private Button ekajnabeehaseenase;

        @FXML
        private Button ekdinaap;

        @FXML
        private Button kisikimuskurahatonpe;

        @FXML
        private Button nextnext;

        @FXML
        private Button previousprevious;

        @FXML
        private Button startstart;

    public void ReturnHome(ActionEvent event) {
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
    public void ReturnPlaylist(ActionEvent event) {
        try {
            Object root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("playlist.fxml")));
            Scene scene = new Scene((Parent) root);
            Stage playlistStage = new Stage();
            playlistStage.setScene(scene);
            playlistStage.show();
            playlistStage.setResizable(false);
            playlistStage.setTitle("Aura");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void ReturnAlbum(ActionEvent event) {
        try {
            Object root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Album.fxml")));
            Scene scene = new Scene((Parent) root);
            Stage playlistStage = new Stage();
            playlistStage.setScene(scene);
            playlistStage.show();
            playlistStage.setResizable(false);
            playlistStage.setTitle("Aura");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
