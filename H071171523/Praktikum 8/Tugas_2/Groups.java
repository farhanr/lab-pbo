import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 * JavaFX App
 */
public class Groups extends Application implements EventHandler<ActionEvent> {
    private Stage window;
    private Scene mainScene;
    private GridPane mainGrid;
    private VBox groupsMainLayout, dataMainLayout, dataLabelVLayout, dataInputsVLayout;
    private HBox group1Layout, group2Layout, group3Layout, group4Layout, groupLayer1Layout, groupLayer2Layout, maleLayout, femaleLayout, dataHLayout;
    private Label groupLabel, group1Label, group2Label, group3Label, group4Label, dataLabel, nameLabel, idLabel, genderLabel, maleLabel, femaleLabel, userGroup, userId, userName, userGender, userInfoLabel;
    private TextField idTextField, nameTextField;
    private RadioButton group1RadioButton, group2RadioButton, group3RadioButton, group4RadioButton, maleRadioButton, femaleRadioButton;
    private ToggleGroup groupsToggleGroup, genderToggleGroup;
    private Button saveButton;
    private Alert confirmAlert, errorAlert, infoAlert;
    private Optional<ButtonType> answer;


    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Tugas 3");

        mainScene = new Scene(this.getMainScene(), 600, 250);

        window.setScene(mainScene);
        window.show();

    }

    private GridPane getMainScene() {
        mainGrid = new GridPane();
        mainGrid.setPadding(new Insets(30, 30, 30, 30));
        mainGrid.setVgap(10);
        mainGrid.setHgap(30);

        groupsMainLayout = new VBox(10);
        group1Layout = new HBox(10);
        group2Layout = new HBox(10);
        group3Layout = new HBox(10);
        group4Layout = new HBox(10);
        groupLayer1Layout = new HBox(50);
        groupLayer2Layout = new HBox(50);

        groupsToggleGroup = new ToggleGroup();
        group1RadioButton = new RadioButton();
        group1RadioButton.setToggleGroup(groupsToggleGroup);
        group2RadioButton = new RadioButton();
        group2RadioButton.setToggleGroup(groupsToggleGroup);
        group3RadioButton = new RadioButton();
        group3RadioButton.setToggleGroup(groupsToggleGroup);
        group4RadioButton = new RadioButton();
        group4RadioButton.setToggleGroup(groupsToggleGroup);

        groupLabel = new Label("KELOMPOK");
        groupLabel.setStyle("-fx-font-size:16px;");
        groupLabel.setAlignment(Pos.CENTER);
        group1Label = new Label("Kelompok 1");
        group2Label = new Label("Kelompok 2");
        group3Label = new Label("Kelompok 3");
        group4Label = new Label("Kelompok 4");

        group1Layout.getChildren().addAll(group1RadioButton, group1Label);
        group2Layout.getChildren().addAll(group2RadioButton, group2Label);
        group3Layout.getChildren().addAll(group3RadioButton, group3Label);
        group4Layout.getChildren().addAll(group4RadioButton, group4Label);

        groupLayer1Layout.getChildren().addAll(group1Layout, group3Layout);
        groupLayer2Layout.getChildren().addAll(group2Layout, group4Layout);
        groupsMainLayout.getChildren().addAll(groupLabel, groupLayer1Layout, groupLayer2Layout);

        dataMainLayout = new VBox(10);
        dataHLayout = new HBox(10);
        dataLabelVLayout = new VBox(10);
        dataInputsVLayout = new VBox(3);
        maleLayout = new HBox(10);
        femaleLayout = new HBox(10);
        
        genderToggleGroup = new ToggleGroup();
        maleRadioButton = new RadioButton();
        maleRadioButton.setToggleGroup(genderToggleGroup);
        femaleRadioButton = new RadioButton();
        femaleRadioButton.setToggleGroup(genderToggleGroup);

        idTextField = new TextField();
        idTextField.setPrefHeight(5);
        idTextField.setPromptText("Enter your ID");
        nameTextField = new TextField();
        nameTextField.setPromptText("Enter your name");

        dataLabel = new Label("DATA");
        dataLabel.setStyle("-fx-font-size:16px;");
        idLabel = new Label("NIM");
        nameLabel = new Label("Nama");
        genderLabel = new Label("Jenis Kelamin");
        maleLabel = new Label("Laki-Laki");
        femaleLabel = new Label("Perempuan");

        maleLayout.getChildren().addAll(maleRadioButton, maleLabel);
        femaleLayout.getChildren().addAll(femaleRadioButton, femaleLabel);

        saveButton = new Button("SAVE");
        saveButton.setOnAction(this);

        dataLabelVLayout.getChildren().addAll(idLabel, nameLabel, genderLabel);
        dataInputsVLayout.getChildren().addAll(idTextField, nameTextField, maleLayout, femaleLayout, saveButton);
        dataHLayout.getChildren().addAll(dataLabelVLayout, dataInputsVLayout);
        dataMainLayout.getChildren().addAll(dataLabel, dataHLayout);

        GridPane.setConstraints(groupsMainLayout, 0, 0);
        GridPane.setConstraints(dataMainLayout, 1, 0);

        mainGrid.getChildren().addAll(groupsMainLayout, dataMainLayout);
        mainGrid.setAlignment(Pos.CENTER);
        return mainGrid;
    }

	@Override
	public void handle(ActionEvent event) {
        errorAlert = new Alert(AlertType.ERROR);
        infoAlert = new Alert(AlertType.INFORMATION);

        List<RadioButton> groupsRadioButtonList = new ArrayList<>();
        groupsRadioButtonList.add(group1RadioButton);
        groupsRadioButtonList.add(group2RadioButton);
        groupsRadioButtonList.add(group3RadioButton);
        groupsRadioButtonList.add(group4RadioButton);
        List<RadioButton> genderRadioButtonList = new ArrayList<>();
        genderRadioButtonList.add(maleRadioButton);
        genderRadioButtonList.add(femaleRadioButton);

        userGroup = new Label();
        userGender = new Label();
        userId = new Label();
        userName = new Label();  
        userInfoLabel = new Label();

        if (buttonChecker(groupsRadioButtonList) && buttonChecker(genderRadioButtonList) && idTextField.getText() != null && nameTextField.getText() != null) {

            if (group1RadioButton.isSelected()) {
                this.userGroup.setText("Kelompok\t: Kelompok 1\n");
            } else if (group2RadioButton.isSelected()) {
                this.userGroup.setText("Kelompok\t: Kelompok 2\n");
            } else if (group3RadioButton.isSelected()) {
                this.userGroup.setText("Kelompok\t: Kelompok 3\n");
            } else if (group4RadioButton.isSelected()) {
                this.userGroup.setText("Kelompok\t: Kelompok 4\n");
            }

            if (maleRadioButton.isSelected()) {
                this.userGender.setText("Jenis Kelamin\t: Laki-Laki\n");
            } else {
                this.userGender.setText("Jenis Kelamin\t: Perempuan\n");
            }

            this.userId.setText("NIM\t\t\t: " + idTextField.getText() + "\n");
            this.userName.setText("Nama\t\t: " + nameTextField.getText() + "\n");

            infoAlert.setTitle("USER INFO");
            userInfoLabel.setText(this.userName.getText() + this.userId.getText() + this.userGender.getText() + this.userGroup.getText());
            infoAlert.setContentText(userInfoLabel.getText());
            infoAlert.showAndWait();
        } else {
            errorAlert.setTitle("ALERT");
            errorAlert.setContentText("Please make sure everything is valid");
            errorAlert.showAndWait();
        }
    }

    private boolean buttonChecker(List<RadioButton> radioButtons) {
        int counter = 0;
        for (RadioButton radioButton : radioButtons) {
            if (radioButton.isSelected()) {
                counter++;
            }
        }
        if (counter == 0) {
            return false;
        } else {
            return true;
        }
    }

    
    public static void main(String[] args) {
        launch();
    }

}