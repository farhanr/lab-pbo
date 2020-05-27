
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Menu extends Application {
    double totalHarga = 0, hargaNasgor = 0, hargaSoto = 0, hargaEsteh = 0, hargaBakso = 0, hargaJusjeruk = 0;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Menu Makanan");

        Label lbNasgor = new Label("  1. Nasi Goreng");
        Label lbSoto = new Label("  2. Soto");
        Label lbEsteh = new Label("  3. Es Teh");
        Label lbBakso = new Label("  4. Bakso");
        Label lbJusjeruk = new Label("  5. Jus Jeruk");

        TextField tfNasgor = new TextField();
        TextField tfSoto = new TextField();
        TextField tfEsteh = new TextField();
        TextField tfBakso = new TextField();
        TextField tfJusjeruk = new TextField();

        tfNasgor.setPromptText("Jumlah");
        tfSoto.setPromptText("Jumlah");
        tfEsteh.setPromptText("Jumlah");
        tfBakso.setPromptText("Jumlah");
        tfJusjeruk.setPromptText("Jumlah");

        tfNasgor.setDisable(true);
        tfSoto.setDisable(true);
        tfEsteh.setDisable(true);

        Button btnHitung = new Button("Hitung");
        Button btnHapus = new Button("Hapus");
        Label lblHarga = new Label();

        HBox box = new HBox(btnHitung, btnHapus);
        box.setSpacing(5);

        GridPane root = new GridPane();
        root.setVgap(10);
        root.setHgap(10);

        root.add(lbNasgor, 0, 1);
        root.add(lbSoto, 0, 2);
        root.add(lbEsteh, 0, 3);
        root.add(lbBakso, 0, 4);
        root.add(lbJusjeruk, 0, 5);

        root.add(tfNasgor, 1, 1);
        root.add(tfSoto, 1, 2);
        root.add(tfEsteh, 1, 3);
        root.add(tfBakso, 1, 4);
        root.add(tfJusjeruk, 1, 5);
        root.add(box, 1, 6);
        root.add(lblHarga, 1, 7);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();


        hargaNasgor = 10000;
        tfNasgor.setDisable(false);
        hargaSoto = 13000;
        tfSoto.setDisable(false);
        hargaEsteh = 5000;
        tfEsteh.setDisable(false);
        hargaBakso = 12000;
        tfBakso.setDisable(false);
        hargaJusjeruk = 6000;
        tfJusjeruk.setDisable(false);


        btnHitung.setOnAction(e->{
           if(tfNasgor.getText().isEmpty() || tfSoto.getText().isEmpty() || tfEsteh.getText().isEmpty() ||
                   tfBakso.getText().isEmpty() || tfJusjeruk.getText().isEmpty()){
               tfNasgor.setText("0");
               tfSoto.setText("0");
               tfEsteh.setText("0");
               tfBakso.setText("0");
               tfJusjeruk.setText("0");

               totalHarga = hargaNasgor * Double.valueOf(tfNasgor.getText()) + hargaSoto * Double.valueOf(tfSoto.getText())
                       + hargaEsteh * Double.valueOf(tfEsteh.getText())+ hargaBakso * Double.valueOf(tfBakso.getText())
                       + hargaJusjeruk * Double.valueOf(tfJusjeruk.getText());
           } else{
               totalHarga = hargaNasgor * Double.valueOf(tfNasgor.getText()) + hargaSoto * Double.valueOf(tfSoto.getText())
                       + hargaEsteh * Double.valueOf(tfEsteh.getText())+ hargaBakso * Double.valueOf(tfBakso.getText())
                       + hargaJusjeruk * Double.valueOf(tfJusjeruk.getText());

               DecimalFormat kursIndo = (DecimalFormat) DecimalFormat.getCurrencyInstance();
               DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

               formatRp.setCurrencySymbol("Rp. ");
               formatRp.setMonetaryDecimalSeparator(',');
               formatRp.setDecimalSeparator('.');
               kursIndo.setDecimalFormatSymbols(formatRp);

               String string = kursIndo.format(totalHarga);
               lblHarga.setText(string);
           }
        });

        btnHapus.setOnAction(e->{
           tfNasgor.clear();
           tfSoto.clear();
           tfEsteh.clear();
           tfBakso.clear();
           tfJusjeruk.clear();
           lblHarga.setText("");
           hargaNasgor = 0;
           hargaSoto = 0;
           hargaEsteh = 0;
           hargaBakso = 0;
           hargaJusjeruk = 0;
        });
    }

    public static void main(String[] args) {
        launch(args);
    }

}
