import java.util.Optional;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Alert;

public class Main extends Application {
    private DataBase dataBase = new DataBase();

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(25, 25, 25, 25));

        VBox boxGroup = new VBox();
        boxGroup.setPadding(new Insets(15, 15, 15, 15));
        boxGroup.setStyle("-fx-background-color: white; -fx-border-style: solid");
        root.setLeft(boxGroup);
        boxGroup.setAlignment(Pos.TOP_CENTER);
        
        RadioButton RBg1 = new RadioButton("Grup 1");
        RadioButton RBg2 = new RadioButton("Grup 2");
        RadioButton RBg3 = new RadioButton("Grup 3");
        RadioButton RBg4 = new RadioButton("Grup 4");
        ToggleGroup tGroup = new ToggleGroup();
        RBg1.setToggleGroup(tGroup);
        RBg2.setToggleGroup(tGroup);
        RBg3.setToggleGroup(tGroup);
        RBg4.setToggleGroup(tGroup);
        
        GridPane gGroup = new GridPane();
        gGroup.setVgap(15);
        gGroup.setHgap(15);
        gGroup.setPadding(new Insets(15, 15, 15, 15));
        gGroup.add(RBg1, 0, 0);
        gGroup.add(RBg2, 1, 0);
        gGroup.add(RBg3, 0, 1);
        gGroup.add(RBg4, 1, 1);
        gGroup.setAlignment(Pos.TOP_CENTER);
        boxGroup.getChildren().addAll(new Label("Grup"), gGroup);

        VBox boxInput = new VBox();
        boxInput.setPadding(new Insets(15, 15, 15, 15));
        boxInput.setStyle("-fx-background-color: white; -fx-border-style: solid");
        boxInput.setAlignment(Pos.TOP_CENTER);
        root.setRight(boxInput);
        
        Label inNama = new Label("Nama");
        TextField inTFNama = new TextField();
        inTFNama.setMaxWidth(200);

        Label inNIM = new Label("Nama");
        TextField inTFNIM = new TextField();
        inTFNIM.setMaxWidth(200);

        Label inJKelamin = new Label("Jenis Kelamin");
        RadioButton lRB = new RadioButton("Laki - Laki");
        RadioButton pRB = new RadioButton("Perempuan");
        ToggleGroup jKtGroup = new ToggleGroup();
        lRB.setToggleGroup(jKtGroup);
        pRB.setToggleGroup(jKtGroup);

        GridPane gInput = new GridPane();
        gInput.setHgap(10);
        gInput.setVgap(10);
        gInput.add(inNama, 0, 0);
        gInput.add(inTFNama, 1, 0);
        gInput.add(inNIM, 0, 1);
        gInput.add(inTFNIM, 1, 1);
        gInput.add(inJKelamin, 0, 2);
        gInput.add(lRB, 1, 2);
        gInput.add(pRB, 1, 3);
        boxInput.getChildren().addAll(new Label("Input"), gInput);

        Button simpanButton = new Button("Simpan");
        simpanButton.setOnAction(actionEvent -> {
            if (tGroup.getSelectedToggle() != null && !inTFNama.getText().isEmpty() && !inTFNIM.getText().isEmpty() && jKtGroup.getSelectedToggle() != null) {
                String nGrup = ((RadioButton) tGroup.getSelectedToggle()).getText();
                String nama = inTFNama.getText();
                String nim = inTFNIM.getText();
                String jKelamin = ((RadioButton) jKtGroup.getSelectedToggle()).getText();

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION, String.format("Grup\t\t\t: %s\nNama\t\t: %s\nNIM\t\t\t: %s\nJenis Kelamin\t: %s\n\n Anda Yakin ?", nGrup, nama, nim, jKelamin), ButtonType.YES, ButtonType.NO);
                Optional<ButtonType> hasil = alert.showAndWait();
                if (hasil.get() == ButtonType.YES) {
                    dataBase.getGrup(nGrup).addAggota(nama, nim, jKelamin);
                }
            } else {
                Alert alerts = new Alert(Alert.AlertType.WARNING, "Ada Inputan Kosong");
                alerts.show();
            }          
        });

        Button showGrupButton = new Button("Lihat Grup");
        showGrupButton.setOnAction(actionEvent -> {
            Stage secondaryStage = new Stage();

            BorderPane showPane = new BorderPane();
            Button tutupButton = new Button("Tutup");
            tutupButton.setOnAction(actionEvent1 -> secondaryStage.close());
            TextArea grupData = new TextArea(getDataGrup());
            grupData.setEditable(false);
            
            showPane.setCenter(grupData);
            BorderPane.setAlignment(tutupButton, Pos.CENTER_RIGHT);
            BorderPane.setMargin(tutupButton, new Insets(10));
            showPane.setBottom(tutupButton);
            showPane.setPadding(new Insets(10));

            secondaryStage.setTitle("List grup");
            secondaryStage.setScene(new Scene(showPane, 300, 300));
            secondaryStage.setResizable(false);
            secondaryStage.show();
        });

        HBox hBox = new HBox(showGrupButton, simpanButton);
        hBox.setSpacing(5);
        hBox.setPadding(new Insets(5, 10, 5, 0));
        root.setBottom(hBox);
        hBox.setAlignment(Pos.CENTER_RIGHT);

        primaryStage.setTitle("Menu");
        primaryStage.setScene(new Scene(root, 600, 300));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public String getDataGrup() {
        StringBuilder sBuilder = new StringBuilder();
        for (Grup grup : dataBase.getListGrup()) {
            sBuilder.append(String.format(">>>>>>>%s<<<<<<<", grup.toString().toUpperCase())).append("\n");
            int i = 0;
            if (grup.getAngGrup().size() == 0) {
                sBuilder.append("Grup Kosong").append("\n");
            }

            for (Anggota anggota : grup.getAngGrup()) {
                i++;
                sBuilder.append(i).append(".").append(anggota.getData());
            }

            sBuilder.append("---------------------------------").append("\n");
        }
        return sBuilder.toString();
    }
}