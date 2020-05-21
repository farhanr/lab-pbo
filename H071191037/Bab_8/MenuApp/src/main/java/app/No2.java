
package app;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class No2 extends Application {

    public static void showWarning(String title, String header, String content) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(header);

        if (content != null)
            alert.setContentText(content);

        alert.showAndWait();
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane root = new GridPane();
        root.setPadding(new Insets(20));
        root.setHgap(25);
        root.setVgap(15);
        root.setStyle("-fx-background-color: #00FFFF;");

        Label labelTitle1 = new Label("Kelompok");
        GridPane.setHalignment(labelTitle1, HPos.CENTER);
        Label labelTitle2 = new Label("Data");
        GridPane.setHalignment(labelTitle2, HPos.CENTER);
        root.add(labelTitle1, 0, 0, 2, 1);
        root.add(labelTitle2, 2, 0, 2, 1);

        RadioButton rb1 = new RadioButton("Kelompok 1");
        RadioButton rb2 = new RadioButton("Kelompok 2");
        Label nim = new Label("NIM");
        nim.setPadding(new Insets(0, 0, 0, 50));
        TextField textNim = new TextField();
        textNim.setPromptText("Masukkan NIM");

        RadioButton rb3 = new RadioButton("Kelompok 3");
        RadioButton rb4 = new RadioButton("Kelompok 4");
        Label nama = new Label("Nama");
        nama.setPadding(new Insets(0, 0, 0, 50));
        TextField textNama = new TextField();
        textNama.setPromptText("Masukkan Nama");

        Label jk = new Label("Jenis Kelamin");
        jk.setPadding(new Insets(0, 0, 0, 50));
        RadioButton male = new RadioButton("Laki-Laki");
        RadioButton female = new RadioButton("Perempuan");

        Button save = new Button("SAVE");

        GridPane.setHalignment(rb1, HPos.LEFT);
        root.add(rb1, 0, 1);
        GridPane.setHalignment(rb2, HPos.LEFT);
        root.add(rb2, 1, 1);
        GridPane.setHalignment(nim, HPos.LEFT);
        root.add(nim, 2, 1);
        GridPane.setHalignment(textNim, HPos.LEFT);
        root.add(textNim, 3, 1);

        GridPane.setHalignment(rb3, HPos.LEFT);
        root.add(rb3, 0, 2);
        GridPane.setHalignment(rb4, HPos.LEFT);
        root.add(rb4, 1, 2);
        GridPane.setHalignment(nama, HPos.LEFT);
        root.add(nama, 2, 2);
        GridPane.setHalignment(textNama, HPos.LEFT);
        root.add(textNama, 3, 2);

        GridPane.setHalignment(jk, HPos.LEFT);
        root.add(jk, 2, 3);
        GridPane.setHalignment(male, HPos.LEFT);
        root.add(male, 3, 3);

        GridPane.setHalignment(female, HPos.LEFT);
        root.add(female, 3, 4);

        RadioButton[] arrKelompok = { rb1, rb2, rb3, rb4 };
        ToggleGroup toogleKelompok = new ToggleGroup();

        rb1.setToggleGroup(toogleKelompok);
        rb2.setToggleGroup(toogleKelompok);
        rb3.setToggleGroup(toogleKelompok);
        rb4.setToggleGroup(toogleKelompok);

        RadioButton[] arrJk = { male, female };
        ToggleGroup toogleJk = new ToggleGroup();

        male.setToggleGroup(toogleJk);
        female.setToggleGroup(toogleJk);

        save.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Toggle togglegGroup = toogleKelompok.getSelectedToggle();

                int klmpk = 0;
                String nimm = textNim.getText();
                String namaa = textNama.getText();
                for (int i = 0; i < arrKelompok.length; i++) {
                    if (arrKelompok[i] == togglegGroup) {
                        klmpk = i;
                        break;
                    }
                }

                Toggle toggleGender = toogleJk.getSelectedToggle();
                String jK = null;

                if (toggleGender == arrJk[0]) {
                    jK = "Laki-laki";
                } else if (toggleGender == arrJk[1]) {
                    jK = "Perempuan";
                }

                if (togglegGroup == null || jK == null || nimm == null || nimm.length() == 0 || namaa == null
                        || namaa.length() == 0) {
                    showWarning("Data Error", "\tData belum lengkap", null);
                    return;
                }

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                StringBuilder builder = new StringBuilder();
                builder.append("Nama\t\t: ");
                builder.append(namaa);
                builder.append("\nNIM\t\t\t: ");
                builder.append(nimm);
                builder.append("\nJenis Kelamin\t: ");
                builder.append(jK);
                builder.append("\nKelompok\t: ");
                builder.append(klmpk + 1);
                alert.setTitle("\nInformasi");
                alert.setHeaderText("Data Anda");
                alert.setContentText(builder.toString());
                alert.showAndWait();
            }
        });

        GridPane.setHalignment(save, HPos.RIGHT);
        root.add(save, 3, 5);

        Scene scene = new Scene(root, 580, 230);
        stage.setTitle("Data Kelompok");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}