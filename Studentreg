import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StudentRegistration extends Application {

    private Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    private ObservableList<Student> data = FXCollections.observableArrayList();
    private TableView<Student> table = new TableView<>();
    private TextField tID, tFirstName, tLastName, tNoOfStudents, tEUFCalculation;
    private DatePicker date;
    private ToggleGroup type = new ToggleGroup();
    private RadioButton theoretical, numerical;
    private CheckBox previousLectureReview;
    private ChoiceBox<String> choiceBox;
    private ChoiceBox<String> qualityOfDelivery;
    private Button loginBtn;
    private Label wrongCredentialLbl;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) {
        initializeDatabase();

        Scene loginScene = createLoginScene(window);
        Scene registrationScene = createRegistrationScene(window);

        window.setTitle("Login Window");
        window.setScene(loginScene);
        window.show();
    }

    private void initializeDatabase() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:AdminDatabase");
            System.out.println("Connection Established");
        } catch (ClassNotFoundException | SQLException exp) {
            System.out.println(exp);
        }
    }

    private Scene createLoginScene(Stage window) {
        // Login scene creation logic here...
    }

    private Scene createRegistrationScene(Stage window) {
        // Registration scene creation logic here...
    }

    private void saveAction() {
        // Save action logic here...
    }

    private void clearFields() {
        // Clear fields logic here...
    }

    private void tableLoadAction() {
        // Table load action logic here...
    }

    private void tableMouseAction() {
        // Table mouse action logic here...
    }

    private void updateAction() {
        // Update action logic here...
    }

    private void deleteAction() {
        // Delete action logic here...
    }
}
