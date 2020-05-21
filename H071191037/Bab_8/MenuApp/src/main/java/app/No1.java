package app;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class No1 extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        GridPane root = new GridPane();
        root.setPadding(new Insets(20));
        root.setHgap(10);
        root.setVgap(10);
        root.setStyle("-fx-background-color:#00FFFF;");

        Label title = new Label("Warunk Makan");
        title.setFont(new Font("Berlin Sans FB", 20));
        title.setTextFill(Color.web("#000000"));
        GridPane.setHalignment(title, HPos.CENTER);
        root.add(title, 0, 0, 3, 1);
        
        Label label1 = new Label("Nasi Goyeng");
        label1.setFont(new Font("Arial Rounded MT Bold", 14));
        label1.setTextFill(Color.web("#000000"));
        GridPane.setHalignment(label1, HPos.LEFT);
        root.add(label1, 0, 1);
        Label harga1 = new Label("IDR 15.000");
        harga1.setPadding(new Insets(0, 0, 0, 50));
        harga1.setTextFill(Color.web("#000000"));
        GridPane.setHalignment(harga1, HPos.LEFT);
        root.add(harga1, 1, 1);
        TextField textField1 = new TextField();
        textField1.setPromptText("0");
        GridPane.setHalignment(textField1, HPos.LEFT);
        root.add(textField1, 2, 1);

        Label label2 = new Label("Ayam Goyeng");
        label2.setFont(new Font("Arial Rounded MT Bold", 14));
        GridPane.setHalignment(label2, HPos.LEFT);
        root.add(label2, 0, 2);
        label2.setTextFill(Color.web("#000000"));
        Label harga2 = new Label("IDR 18.000");
        harga2.setPadding(new Insets(0, 0, 0, 50));
        GridPane.setHalignment(harga2, HPos.LEFT);
        harga2.setTextFill(Color.web("#000000"));
        root.add(harga2, 1, 2);
        harga1.setPadding(new Insets(0, 0, 0, 50));
        TextField textField2 = new TextField();
        textField2.setPromptText("0");
        GridPane.setHalignment(textField2, HPos.LEFT);
        root.add(textField2, 2, 2);

        Label label3 = new Label("Mie chicken");
        GridPane.setHalignment(label3, HPos.LEFT);
        root.add(label3, 0, 3);
        label3.setFont(new Font("Arial Rounded MT Bold", 14));
        label3.setTextFill(Color.web("#000000"));
        Label harga3 = new Label("IDR 12.000");
        harga3.setPadding(new Insets(0, 0, 0, 50));
        GridPane.setHalignment(harga3, HPos.LEFT);
        harga3.setTextFill(Color.web("#000000"));
        root.add(harga3, 1, 3);
        harga3.setTextFill(Color.web("#000000"));
        TextField textField3 = new TextField();
        textField3.setPromptText("0");
        GridPane.setHalignment(textField3, HPos.LEFT);
        root.add(textField3, 2, 3);

        Label label4 = new Label("Jus Orange");
        label4.setFont(new Font("Arial Rounded MT Bold", 14));
        GridPane.setHalignment(label4, HPos.LEFT);
        root.add(label4, 0, 4);
        label4.setTextFill(Color.web("#000000"));
        Label harga4 = new Label("IDR 7.000");
        harga4.setPadding(new Insets(0, 0, 0, 50));
        GridPane.setHalignment(harga4, HPos.LEFT);
        root.add(harga4, 1, 4);
        harga4.setTextFill(Color.web("#000000"));
        TextField textField4 = new TextField();
        textField4.setPromptText("0");
        GridPane.setHalignment(textField4, HPos.LEFT);
        root.add(textField4, 2, 4);

        Label label5 = new Label("Air Bening");
        label5.setFont(new Font("Arial Rounded MT Bold", 14));
        GridPane.setHalignment(label5, HPos.LEFT);
        root.add(label5, 0, 5);
        label5.setTextFill(Color.web("#000000"));
        Label harga5 = new Label("IDR 4.000");
        harga5.setPadding(new Insets(0, 0, 0, 50));
        GridPane.setHalignment(harga5, HPos.LEFT);
        root.add(harga5, 1, 5);
        harga5.setTextFill(Color.web("#000000"));
        TextField textField5 = new TextField();
        textField5.setPromptText("0");
        GridPane.setHalignment(textField5, HPos.LEFT);
        root.add(textField5, 2, 5);

        Button submit = new Button("Submit");
        GridPane.setHalignment(submit, HPos.RIGHT);
        root.add(submit, 1, 6);

        Button cancel = new Button("Cancel");
        GridPane.setHalignment(cancel, HPos.LEFT);
        root.add(cancel, 2, 6);

        Label total = new Label();

        submit.setOnAction(p -> {
            int nasigoyeng = Integer.parseInt(0 + textField1.getText());
            int ayamgoyeng = Integer.parseInt(0 + textField2.getText());
            int mieayam = Integer.parseInt(0 + textField3.getText());
            int jeruk = Integer.parseInt(0 + textField4.getText());
            int air = Integer.parseInt(0 + textField5.getText());
            int totals = ((nasigoyeng * 15000) + (ayamgoyeng * 18000) + (mieayam * 12000) + (jeruk * 7000) + (air * 4000));

            total.setText("Total Pesanan Anda :\t"+ "IDR " + totals);
            root.add(total, 1, 7, 3, 1);
        });

        cancel.setOnAction(j -> {
            root.getChildren().remove(total);
            textField1.setText("");
            textField2.setText("");
            textField3.setText("");
            textField4.setText("");
            textField5.setText("");
        });

        Scene scene = new Scene(root, 460, 300);
        stage.setTitle("Restaurant");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}