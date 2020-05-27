package id.scene;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Kelompok extends Application {
    TextField nimTf, nameTf;
    ToggleGroup kelompokTg, genderTg;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Pembagian Kelompok");

        GridPane gdPane = new GridPane();
        gdPane.setPadding(new Insets(10, 10, 10, 10));
        gdPane.setVgap(5);
        gdPane.setHgap(8);
        gdPane.setStyle("-fx-background-color: #BDBDBD");

        Label kelompokLabel = new Label("Kelompok");
        kelompokLabel.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD, 20));
        gdPane.add(kelompokLabel, 2, 12);

        kelompokTg = new ToggleGroup();
        RadioButton kel1 = new RadioButton("Kelompok 1");
        RadioButton kel2 = new RadioButton("Kelompok 2");
        RadioButton kel3 = new RadioButton("Kelompok 3");
        RadioButton kel4 = new RadioButton("Kelompok 4");
        kel1.setToggleGroup(kelompokTg);
        kel2.setToggleGroup(kelompokTg);
        kel3.setToggleGroup(kelompokTg);
        kel4.setToggleGroup(kelompokTg);
        gdPane.add(kel1, 1, 14);
        gdPane.add(kel2, 3, 14);
        gdPane.add(kel3, 1, 16);
        gdPane.add(kel4, 3, 16);

        Label dataLabel = new Label("Data");
        dataLabel.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD, 20));
        gdPane.add(dataLabel, 18, 12);

        Label nimLabel = new Label("NIM");
        nimTf = new TextField();
        gdPane.add(nimLabel, 15, 14);
        gdPane.add(nimTf, 18, 14);

        Label nameLabel = new Label("Nama");
        nameTf = new TextField();
        gdPane.add(nameLabel, 15, 16);
        gdPane.add(nameTf, 18, 16);

        Label genderLabel = new Label("Jenis Kelamin");
        genderTg = new ToggleGroup();
        RadioButton lkGender = new RadioButton("Laki-laki");
        RadioButton prGender = new RadioButton("Perempuan");
        lkGender.setToggleGroup(genderTg);
        prGender.setToggleGroup(genderTg);
        gdPane.add(genderLabel, 15, 18);
        gdPane.add(lkGender, 18, 18);
        gdPane.add(prGender, 18, 20);

        Button saveBtn = new Button("SAVE");
        saveBtn.setFont(Font.font("Courier", FontWeight.BOLD, 13));
        gdPane.add(saveBtn, 18, 25);
        saveBtn.setOnMouseClicked(e -> alertWindow());

        Scene scene = new Scene(gdPane, 700, 400);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    private void alertWindow() {

        RadioButton selected = (RadioButton) kelompokTg.getSelectedToggle();
        String selectedGroup = selected.getText();
        String nimStr = nimTf.getText();
        String nameStr = nameTf.getText();

        RadioButton selected2 = (RadioButton) genderTg.getSelectedToggle();
        String selectedGender = selected2.getText();

        Alert alertBox = new Alert(AlertType.INFORMATION);
        alertBox.setTitle("Data Siswa");
        alertBox.setContentText(
                String.valueOf(String.format("NIM\t\t\t: %s\nNama\t\t: %s\nJenis Kelamin\t: %s\nKelompok\t: %s", nimStr,
                        nameStr, selectedGender, selectedGroup)));
        alertBox.showAndWait();

    }

}