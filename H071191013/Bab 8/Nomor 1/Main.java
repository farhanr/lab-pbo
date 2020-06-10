import java.util.Optional;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    private DataBase dataBase = new DataBase();

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox menuBox = new VBox();
        Text menuBoxHeader = new Text("\tMenu");
        menuBoxHeader.setFont(Font.font("times new roman", 14));
        ListView<String> listMenu = new ListView<>();
        listMenu.getItems().addAll(dataBase.getMenu().getItemName());
        menuBox.getChildren().add(menuBoxHeader);
        menuBox.getChildren().add(listMenu);
        menuBox.setPadding(new Insets(10));

        VBox hargaBox = new VBox();
        Text hargaBoxHeader = new Text("\tHarga");
        hargaBoxHeader.setFont(Font.font("times new roman", 14));
        ListView<String> listHarga = new ListView<>();
        listHarga.getItems().addAll(dataBase.getMenu().getItemHarga());
        hargaBox.getChildren().add(hargaBoxHeader);
        hargaBox.getChildren().add(listHarga);
        hargaBox.setPadding(new Insets(10, 10, 10, 0));

        VBox userBox = new VBox();
        userBox.setSpacing(5);
        Text userBoxHeader = new Text("Pesan");
        userBoxHeader.setFont(Font.font("times new roman", 14));
        TextArea keranjangTA = new TextArea(dataBase.printDetailKeranjang());
        keranjangTA.setEditable(false);
        userBox.setPadding(new Insets(10));

        
        Button tambahBtn = new Button("Tambah");
        tambahBtn.setOnAction(actionEvent -> {
            dataBase.tambahPesanan(listMenu.getSelectionModel().getSelectedItem());
            keranjangTA.setText(dataBase.printDetailKeranjang());
        });
        tambahBtn.setPrefWidth(100);
        
        Button hapusBtn = new Button("Hapus");
        hapusBtn.setOnAction(actionEvent -> {
            dataBase.hapusPesanan(listMenu.getSelectionModel().getSelectedItem());
            keranjangTA.setText(dataBase.printDetailKeranjang());
        });
        hapusBtn.setPrefWidth(100);
        
        Button bayarBtn = new Button("Bayar");
        bayarBtn.setOnAction(actionEvent -> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Anda Yakin ?", ButtonType.YES, ButtonType.NO);
            Optional<ButtonType> hasil = alert.showAndWait();
            if (hasil.get() == ButtonType.YES) {   
                Stage secondaryStage = new Stage();

                BorderPane root = new BorderPane();
                Button klikBayarBtn = new Button("Bayar");
                klikBayarBtn.setOnAction(actionEvent1 -> {
                    dataBase.bayar();
                    keranjangTA.setText(dataBase.printDetailKeranjang());
                    secondaryStage.close();
                });
                klikBayarBtn.setPrefWidth(100);

                Button klikBatalBtn = new Button("Batal");
                klikBatalBtn.setOnAction(actionEvent2 -> secondaryStage.close());
                klikBatalBtn.setPrefWidth(100);
                
                HBox buttonBox = new HBox();
                buttonBox.setSpacing(5);
                buttonBox.getChildren().addAll(klikBayarBtn, klikBatalBtn);

                TextArea struk = new TextArea(dataBase.printStruk());
                struk.setEditable(false);
                
                root.setCenter(struk);
                BorderPane.setAlignment(buttonBox, Pos.BOTTOM_RIGHT);
                BorderPane.setMargin(buttonBox, new Insets(10, 0, 10, 10));
                root.setBottom(buttonBox);
                root.setPadding(new Insets(10));
                
                secondaryStage.setTitle("Struk");
                secondaryStage.setScene(new Scene(root, 300, 300));
                secondaryStage.setResizable(false);
                secondaryStage.show();
            }
        });
        bayarBtn.setPrefWidth(100);

        HBox buttonBox = new HBox();
        buttonBox.setSpacing(5);
        buttonBox.getChildren().addAll(tambahBtn, hapusBtn, bayarBtn);
        
        userBox.getChildren().addAll(userBoxHeader, buttonBox, keranjangTA);
        
        HBox root = new HBox(menuBox, hargaBox, userBox);
        primaryStage.setTitle("Menu");
        primaryStage.setScene(new Scene(root, 600, 300));
        primaryStage.show();
    }
}