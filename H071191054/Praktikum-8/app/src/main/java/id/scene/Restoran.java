package id.scene;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Restoran extends Application {

    Scene scene1, scene2, scene3;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage window) throws Exception {
        // first scene
        window.setTitle("Restaurant");

        Label welcomeLabel = new Label();
        String title = "Welcome to the Restaurant";
        welcomeLabel.setText(title);
        welcomeLabel.setFont(Font.font("Helvetica", FontWeight.EXTRA_BOLD, 25));
        welcomeLabel.setTextFill(Color.web("#0B4C5F"));

        Button orderBtn = new Button();
        orderBtn.setText("Click here to order");
        orderBtn.setFont(Font.font("Helvetica", FontWeight.BOLD, 12));

        VBox vbox = new VBox(20);
        vbox.getChildren().addAll(welcomeLabel, orderBtn);
        vbox.setAlignment(Pos.CENTER);
        vbox.setStyle("-fx-background-color: #BDBDBD");

        scene1 = new Scene(vbox, 500, 300);

        // second scene
        orderBtn.setOnAction(e -> {

            GridPane gdPane = new GridPane();
            gdPane.setPadding(new Insets(10, 10, 10, 10));
            gdPane.setVgap(3);
            gdPane.setHgap(20);

            VBox newvb = new VBox();
            VBox menuVb = new VBox();

            Label menuLabel = new Label("MENU LIST");
            menuLabel.setFont(Font.font("Helvetica", FontWeight.EXTRA_BOLD, 35));
            menuLabel.setTextFill(Color.web("#0B4C5F"));
            menuVb.getChildren().add(menuLabel);
            menuVb.setAlignment(Pos.CENTER);

            Label nasgor = new Label("Nasi Goreng");
            nasgor.setFont(Font.font("Helvetica", FontWeight.BOLD, 14));
            nasgor.setTextFill(Color.web("#086A87"));
            TextField jumlahNasgor = new TextField();
            jumlahNasgor.setMaxWidth(30);
            Label hargaNasgor = new Label("Rp. 18.000");
            hargaNasgor.setFont(Font.font("Helvetica", FontWeight.BOLD, 14));
            hargaNasgor.setTextFill(Color.web("#086A87"));

            Label bakso = new Label("Mie Bakso");
            bakso.setFont(Font.font("Helvetica", FontWeight.BOLD, 14));
            bakso.setTextFill(Color.web("#086A87"));
            TextField jumlahBakso = new TextField();
            jumlahBakso.setMaxWidth(30);
            Label hargaBakso = new Label("Rp. 15.000");
            hargaBakso.setFont(Font.font("Helvetica", FontWeight.BOLD, 14));
            hargaBakso.setTextFill(Color.web("#086A87"));

            Label ayam = new Label("Ayam Bakar");
            ayam.setFont(Font.font("Helvetica", FontWeight.BOLD, 14));
            ayam.setTextFill(Color.web("#086A87"));
            TextField jumlahAyam = new TextField();
            jumlahAyam.setMaxWidth(30);
            Label hargaAyam = new Label("Rp. 20.000");
            hargaAyam.setFont(Font.font("Helvetica", FontWeight.BOLD, 14));
            hargaAyam.setTextFill(Color.web("#086A87"));

            Label esTeh = new Label("Es Teh Manis");
            esTeh.setFont(Font.font("Helvetica", FontWeight.BOLD, 14));
            esTeh.setTextFill(Color.web("#086A87"));
            TextField jumlahEsTeh = new TextField();
            jumlahEsTeh.setMaxWidth(30);
            Label hargaEsTeh = new Label("Rp. 10.000");
            hargaEsTeh.setFont(Font.font("Helvetica", FontWeight.BOLD, 14));
            hargaEsTeh.setTextFill(Color.web("#086A87"));

            Label esJeruk = new Label("Es Jeruk");
            esJeruk.setFont(Font.font("Helvetica", FontWeight.BOLD, 14));
            esJeruk.setTextFill(Color.web("#086A87"));
            TextField jumlahEsJeruk = new TextField();
            jumlahEsJeruk.setMaxWidth(30);
            Label hargaEsJeruk = new Label("Rp. 10.000");
            hargaEsJeruk.setFont(Font.font("Helvetica", FontWeight.BOLD, 14));
            hargaEsJeruk.setTextFill(Color.web("#086A87"));

            Button submitBtn = new Button("Submit");
            submitBtn.setFont(Font.font("Helvetica", FontWeight.BOLD, 12));

            submitBtn.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {

                    Label billLabel = new Label("BILL");
                    billLabel.setFont(Font.font("Helvetica", FontWeight.EXTRA_BOLD, 40));
                    billLabel.setTextFill(Color.web("#0B4C5F"));

                    GridPane billPane = new GridPane();
                    billPane.add(billLabel, 1, 1);
                    billPane.setAlignment(Pos.CENTER);

                    Label lblnasgor = new Label();
                    lblnasgor.setFont(Font.font("Helvetica", FontWeight.BOLD, 14));
                    Label lblbakso = new Label();
                    lblbakso.setFont(Font.font("Helvetica", FontWeight.BOLD, 14));
                    Label lblayam = new Label();
                    lblayam.setFont(Font.font("Helvetica", FontWeight.BOLD, 14));
                    Label lblesteh = new Label();
                    lblesteh.setFont(Font.font("Helvetica", FontWeight.BOLD, 14));
                    Label lblesjeruk = new Label();
                    lblesjeruk.setFont(Font.font("Helvetica", FontWeight.BOLD, 14));

                    int bill1, bill2, bill3, bill4, bill5;

                    if (jumlahNasgor.getText().isEmpty()) {
                        bill1 = 0;
                    } else {
                        bill1 = Integer.parseInt(jumlahNasgor.getText());
                        lblnasgor.setText(jumlahNasgor.getText() + " pcs Nasi Goreng");
                    }

                    if (jumlahBakso.getText().isEmpty()) {
                        bill2 = 0;
                    } else {
                        bill2 = Integer.parseInt(jumlahBakso.getText());
                        lblbakso.setText(jumlahBakso.getText() + " pcs Mie Bakso");
                    }

                    if (jumlahAyam.getText().isEmpty()) {
                        bill3 = 0;
                    } else {
                        bill3 = Integer.parseInt(jumlahAyam.getText());
                        lblayam.setText(jumlahAyam.getText() + " pcs Ayam Bakar");
                    }

                    if (jumlahEsTeh.getText().isEmpty()) {
                        bill4 = 0;
                    } else {
                        bill4 = Integer.parseInt(jumlahEsTeh.getText());
                        lblesteh.setText(jumlahEsTeh.getText() + " pcs Es Teh");
                    }

                    if (jumlahEsJeruk.getText().isEmpty()) {
                        bill5 = 0;
                    } else {
                        bill5 = Integer.parseInt(0 + jumlahEsJeruk.getText());
                        lblesjeruk.setText(jumlahEsJeruk.getText() + " pcs Es Jeruk");
                    }

                    Label totalLabel = new Label();
                    double total = (bill1 * 18000) + (bill2 * 15000) + (bill3 * 20000) + (bill4 * 10000)
                            + (bill5 * 10000);
                    totalLabel.setText("Rp. " + String.valueOf(total));
                    totalLabel.setFont(Font.font("Helvetica", FontWeight.BOLD, 14));

                    Button backBtn = new Button("Back");
                    backBtn.setFont(Font.font("Helvetica", FontWeight.BOLD, 12));

                    VBox billVb = new VBox();
                    billVb.setAlignment(Pos.CENTER);

                    billVb.getChildren().add(billPane);
                    if (!jumlahNasgor.getText().isEmpty()) {
                        billVb.getChildren().add(lblnasgor);
                    }

                    if (!jumlahBakso.getText().isEmpty()) {
                        billVb.getChildren().add(lblbakso);
                    }

                    if (!jumlahAyam.getText().isEmpty()) {
                        billVb.getChildren().add(lblayam);
                    }

                    if (!jumlahEsTeh.getText().isEmpty()) {
                        billVb.getChildren().add(lblesteh);
                    }

                    if (!jumlahEsJeruk.getText().isEmpty()) {
                        billVb.getChildren().add(lblesjeruk);
                    }

                    billVb.getChildren().addAll(totalLabel, backBtn);
                    billVb.setStyle("-fx-background-color: #BDBDBD");

                    backBtn.setOnAction(l -> {
                        billVb.getChildren().removeAll(lblnasgor, lblbakso, lblayam, lblesteh, lblesjeruk, totalLabel);
                        window.setScene(scene2);
                    });

                    scene3 = new Scene(billVb, 500, 300);
                    window.setScene(scene3);

                }
            });

            gdPane.setVgap(10);
            gdPane.setHgap(10);
            gdPane.setAlignment(Pos.TOP_CENTER);
            gdPane.add(nasgor, 1, 1);
            gdPane.add(jumlahNasgor, 2, 1);
            gdPane.add(hargaNasgor, 6, 1);

            gdPane.add(bakso, 1, 3);
            gdPane.add(jumlahBakso, 2, 3);
            gdPane.add(hargaBakso, 6, 3);

            gdPane.add(ayam, 1, 5);
            gdPane.add(jumlahAyam, 2, 5);
            gdPane.add(hargaAyam, 6, 5);

            gdPane.add(esTeh, 1, 7);
            gdPane.add(jumlahEsTeh, 2, 7);
            gdPane.add(hargaEsTeh, 6, 7);

            gdPane.add(esJeruk, 1, 9);
            gdPane.add(jumlahEsJeruk, 2, 9);
            gdPane.add(hargaEsJeruk, 6, 9);

            gdPane.add(submitBtn, 6, 10);

            newvb.getChildren().addAll(menuVb, gdPane);
            newvb.setStyle("-fx-background-color: #BDBDBD");

            scene2 = new Scene(newvb, 400, 450);
            window.setScene(scene2);

        });
        window.setScene(scene1);
        window.show();
    }

}