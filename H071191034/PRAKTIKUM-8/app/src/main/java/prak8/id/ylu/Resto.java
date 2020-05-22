//NO 1

package prak8.id.ylu;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class Resto extends Application {

    private GridPane grid;
    private TextFlow txtflow;
    private Button submitBtn, proceedBtn;
    private Label harga1, harga2, harga3, harga4, harga5, harga6;
    private TextField amt1, amt2, amt3, amt4, amt5, amt6;
    private CheckBox menu1, menu2, menu3, menu4, menu5, menu6;
    private Stage window;
    private Scene scene, scene2;
    
    @Override
    public void start(Stage stage) throws Exception {

        window = stage;
        stage.setTitle("Daftar Menu");

        VBox titleBox = new VBox();
        VBox vbox = new VBox();
        txtflow = new TextFlow();

        grid = new GridPane();
        grid.setPadding(new Insets(15, 20, 15, 15));
        grid.setVgap(10);
        grid.setHgap(20);

        Label restaurantName = new Label("Resto Pak Bejo\n\n");
        restaurantName.setFont(Font.font("Copperplate Gothic Light", FontWeight.BOLD, 36));
        restaurantName.setTextFill(Color.web("#ffffff"));
        titleBox.getChildren().add(restaurantName);
        titleBox.setAlignment(Pos.CENTER);
        titleBox.setStyle("-fx-background-color: #cc3333;");

        Label menuItem = new Label("MENU :");
        menuItem.setFont(Font.font("Century Gothic", 18));
        menuItem.setTextFill(Color.web("#000000"));
        grid.add(menuItem, 0, 1);

        Label amount = new Label("Jlh. :");
        amount.setFont(Font.font("Century Gothic", 18));
        amount.setTextFill(Color.web("#000000"));
        grid.add(amount, 5, 1);

        Label price = new Label("Harga :");
        price.setFont(Font.font("Century Gothic", 18));
        price.setTextFill(Color.web("#000000"));
        grid.add(price, 8, 1);

        menu1 = new CheckBox("Nasi+Ayam Lalapan");
        amt1 = new TextField();
        harga1 = new Label("Rp. 25,000.00,-");
        menu1.setFont(Font.font("Trebuchet MS", FontWeight.BOLD, 14));
        amt1.setFont(Font.font("Calisto MT", FontWeight.BOLD, 12));
        amt1.setPrefWidth(1);
        harga1.setFont(Font.font("Georgia", FontWeight.BOLD, 14));
        harga1.setTextFill(Color.web("#cc5200"));
        grid.add(menu1, 0, 2);
        grid.add(amt1, 5, 2);
        grid.add(harga1, 8, 2);

    

        menu2 = new CheckBox("Nasi+Ayam Penyet");
        amt2 = new TextField();
        harga2 = new Label("Rp. 25,000.00,-");
        menu2.setFont(Font.font("Trebuchet MS", FontWeight.BOLD, 14));
        amt2.setFont(Font.font("Calisto MT", FontWeight.BOLD, 12));
        amt2.setPrefSize(1, 1);
        harga2.setFont(Font.font("Georgia", FontWeight.BOLD, 14));
        harga2.setTextFill(Color.web("#cc5200"));
        grid.add(menu2, 0, 3);
        grid.add(amt2, 5, 3);
        grid.add(harga2, 8, 3);

 

        menu3 = new CheckBox("Nasi+Ikan Goreng");
        amt3 = new TextField();
        harga3 = new Label("Rp. 30,000.00,-");
        menu3.setFont(Font.font("Trebuchet MS", FontWeight.BOLD, 14));
        amt3.setPrefSize(1, 1);
        amt3.setFont(Font.font("Calisto MT", FontWeight.BOLD, 12));
        harga3.setFont(Font.font("Georgia", FontWeight.BOLD, 14));
        harga3.setTextFill(Color.web("#cc5200"));
        grid.add(menu3, 0, 4);
        grid.add(amt3, 5, 4);
        grid.add(harga3, 8, 4);

  
        menu4 = new CheckBox("Nasi+Ikan Bakar");
        amt4 = new TextField();
        harga4 = new Label("Rp. 35,000.00,-");
        menu4.setFont(Font.font("Trebuchet MS", FontWeight.BOLD, 14));
        amt4.setFont(Font.font("Calisto MT", FontWeight.BOLD, 12));
        amt4.setPrefSize(1, 1);
        harga4.setFont(Font.font("Georgia", FontWeight.BOLD, 14));
        harga4.setTextFill(Color.web("#cc5200"));
        grid.add(menu4, 0, 5);
        grid.add(amt4, 5, 5);
        grid.add(harga4, 8, 5);

    

        menu5 = new CheckBox("Nasi Goreng Gila");
        amt5 = new TextField();
        harga5 = new Label("Rp. 25,000.00,-");
        menu5.setFont(Font.font("Trebuchet MS", FontWeight.BOLD, 14));
        amt5.setFont(Font.font("Calisto MT", FontWeight.BOLD, 12));
        amt5.setPrefSize(1, 1);
        harga5.setFont(Font.font("Georgia", FontWeight.BOLD, 14));
        harga5.setTextFill(Color.web("#cc5200"));
        grid.add(menu5, 0, 6);
        grid.add(amt5, 5, 6);
        grid.add(harga5, 8, 6);

        menu6 = new CheckBox("Es Teh Manis");
        amt6 = new TextField();
        harga6 = new Label("Rp. 8,000.00,-");
        menu6.setFont(Font.font("Trebuchet MS", FontWeight.BOLD, 14));
        amt6.setFont(Font.font("Calisto MT", FontWeight.BOLD, 12));
        amt6.setPrefSize(1, 1);
        harga6.setFont(Font.font("Georgia", FontWeight.BOLD, 14));
        harga6.setTextFill(Color.web("#cc5200"));
        grid.add(menu6, 0, 7);
        grid.add(amt6, 5, 7);
        grid.add(harga6, 8, 7);


        submitBtn = new Button("SUBMIT");
        submitBtn.setOnAction(e -> orderedItems());
        submitBtn.setFont(Font.font("Lucida Sans Unicode", 13));
        submitBtn.setStyle("-fx-text-fill: #000000; -fx-body-color: #ffcc00;");
        grid.add(submitBtn, 8, 10);

        grid.setAlignment(Pos.BASELINE_LEFT);
        vbox.getChildren().addAll(titleBox, grid);

        StackPane pane = new StackPane();
      
        scene = new Scene(pane, 600, 700);
        pane.setStyle("-fx-background-color: #ffe066;");
        pane.getChildren().addAll(vbox);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

    private void orderedItems() {


        Label itemsOrdered = new Label("Daftar Pesanan :");
        itemsOrdered.setFont(Font.font("Century Gothic", FontWeight.BOLD, 15));
        grid.add(itemsOrdered, 0, 11);

        String qnt1 = amt1.getText();
        String mn1 = null;
        if (menu1.isSelected()) {
            mn1 = menu1.getText();
        }

        Text order1 = new Text();
        if (mn1 != null) {
            order1.setText(String.valueOf(String.format("\n%s %s", qnt1, mn1)));
            order1.setFont(Font.font("Georgia", FontWeight.BOLD, 14));
            order1.setFill(Color.web("#b30000"));
        } else {
            order1.setText("");
        }

        String qnt2 = amt2.getText();
        String mn2 = null;
        if (menu2.isSelected()) {
            mn2 = menu2.getText();
        }

        Text order2 = new Text();
        if (mn2 != null) {
            order2.setText(String.valueOf(String.format("\n%s %s", qnt2, mn2)));
            order2.setFont(Font.font("Georgia", FontWeight.BOLD, 14));
            order2.setFill(Color.web("#b30000"));
        } else {
            order2.setText("");
        }

        String qnt3 = amt3.getText();
        String mn3 = null;
        if (menu3.isSelected()) {
            mn3 = menu3.getText();
        }
        
        Text order3 = new Text();
        if (mn3 != null) {
            order3.setText(String.valueOf(String.format("\n%s %s", qnt3, mn3)));
            order3.setFont(Font.font("Georgia", FontWeight.BOLD, 14));
            order3.setFill(Color.web("#b30000"));
        } else {
            order3.setText("");
        }

        String qnt4 = amt4.getText();
        String mn4 = null;
        if (menu4.isSelected()) {
            mn4 = menu4.getText();
        }

        Text order4 = new Text();
        if (mn4 != null) {
            order4.setText(String.valueOf(String.format("\n%s %s", qnt4, mn4)));
            order4.setFont(Font.font("Georgia", FontWeight.BOLD, 14));
            order4.setFill(Color.web("#b30000"));
        } else {
            order4.setText("");
        }

        String qnt5 = amt5.getText();
        String mn5 = null;
        if (menu5.isSelected()) {
            mn5 = menu5.getText();
        }

        Text order5 = new Text();
        if (mn5 != null) {
            order5.setText(String.valueOf(String.format("\n%s %s", qnt5, mn5)));
            order5.setFont(Font.font("Georgia", FontWeight.BOLD, 14));
            order5.setFill(Color.web("#b30000"));
        } else {
            order5.setText("");
        }

        String qnt6 = amt6.getText();
        String mn6 = null;
        if (menu6.isSelected()) {
            mn6 = menu6.getText();
        }

        Text order6 = new Text();
        if (mn6 != null) {
            order6.setText(String.valueOf(String.format("\n%s %s", qnt6, mn6)));
            order6.setFont(Font.font("Georgia", FontWeight.BOLD, 14));
            order6.setFill(Color.web("#b30000"));
        } else {
            order6.setText("");
        }

        txtflow.getChildren().addAll(order1, order2, order3, order4, order5, order6);
        grid.add(txtflow, 0, 13);

        // Scene scene2 = new Scene(pane2, 600,700);
        proceedBtn = new Button("Pesanan Benar");
        proceedBtn.setFont(Font.font("Lucida Sans Unicode", 13));
        proceedBtn.setStyle("-fx-text-fill: #000000; -fx-body-color: #ffcc00;");
        grid.add(proceedBtn, 0, 14);
        proceedBtn.setOnAction(e -> window.setScene(scene2));
        
        VBox vbox2 = new VBox();
        Label bill = new Label("BILL :");
        bill.setFont(Font.font("Century Gothic", FontWeight.EXTRA_BOLD, 50));
        
        int bill1, bill2, bill3, bill4, bill5, bill6;
        
        if (amt1.getText().isEmpty()) {
            bill1 = 0;
        } else {
            bill1 = Integer.parseInt(amt1.getText());
        }
        
        if (amt2.getText().isEmpty()) {
            bill2 = 0;
        } else {
            bill2 = Integer.parseInt(amt2.getText());
        }
        
        if (amt3.getText().isEmpty()) {
            bill3 = 0;
        } else {
            bill3 = Integer.parseInt(amt3.getText());
        }
        
        if (amt4.getText().isEmpty()) {
            bill4 = 0;
        } else {
            bill4 = Integer.parseInt(amt4.getText());
        }

        if (amt5.getText().isEmpty()) {
            bill5 = 0;
        } else {
            bill5 = Integer.parseInt(amt5.getText());
        }

        if (amt6.getText().isEmpty()) {
            bill6 = 0;
        } else {
            bill6 = Integer.parseInt(amt6.getText());
        }
        
        double subtotal = (bill1 * 25000) + (bill2 * 25000) + (bill3 * 30000) + (bill4 * 35000) + (bill5 * 25000)
        + (bill6 * 8000);
        double tax = subtotal * (0.1);
        double total = subtotal + tax;
        
        DecimalFormat idKurs = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols rp = new DecimalFormatSymbols();
        
        rp.setCurrencySymbol("Rp. ");
        rp.setMonetaryDecimalSeparator(',');
        rp.setGroupingSeparator('.');
        idKurs.setDecimalFormatSymbols(rp);

        Text stotal = new Text();
        stotal.setText(String.valueOf(String.format(" Subtotal   : %s,-", idKurs.format(subtotal))));
        stotal.setFont(Font.font("Trebuchet MS", 20));
        stotal.setFill(Color.web("#b30000"));
        
        
        Text taxx = new Text();
        taxx.setText(String.valueOf(String.format(" Pajak       : %s,-", idKurs.format(tax))));
        taxx.setFont(Font.font("Trebuchet MS", 20));
        taxx.setFill(Color.web("#b30000"));
        
        
        Label totall = new Label();
        totall.setText(String.valueOf(String.format(" TOTAL   : %s,- ", idKurs.format(total))));
        totall.setFont(Font.font("Trebuchet MS", FontWeight.BOLD, 30));
        totall.setTextFill(Color.web("#b30000"));
         

        vbox2.setAlignment(Pos.CENTER);
        vbox2.getChildren().addAll(bill, stotal,taxx, totall);
        vbox2.setStyle("-fx-background-color: #ffe066;");
        scene2 = new Scene(vbox2,600,700);

        window.setScene(scene);
        window.show();
                
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}