package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Max Moreira
 */
public class CalculadoraController implements Initializable {

    double valor1 = 0;
    double valor2 = 0;
    double resultado = 0;

    String operacao = "";

    @FXML
    private javafx.scene.control.TextField tfTela;
    @FXML
    private Button btnNove;
    @FXML
    private Button btnOito;
    @FXML
    private Button btnSete;
    @FXML
    private Button btnSeis;
    @FXML
    private Button btnCinco;
    @FXML
    private Button btnQuatro;
    @FXML
    private Button btnTres;
    @FXML
    private Button btnDois;
    @FXML
    private Button btnUm;
    @FXML
    private Button btnZero;
    @FXML
    private Button btnPonto;

    @FXML
    private Button btnAdi;
    @FXML
    private Button btnSub;
    @FXML
    private Button btnMult;
    @FXML
    private Button btnDiv;
    @FXML
    private Button btnIgual;
    @FXML
    private Button btnApagar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        btnUm.setOnAction((ActionEvent event) -> {
            tfTela.setText(tfTela.getText() + "1");
        });

        btnDois.setOnAction((ActionEvent event) -> {
            tfTela.setText(tfTela.getText() + "2");
        });

        btnTres.setOnAction((ActionEvent event) -> {
            tfTela.setText(tfTela.getText() + "3");
        });

        btnQuatro.setOnAction((ActionEvent event) -> {
            tfTela.setText(tfTela.getText() + "4");
        });

        btnCinco.setOnAction((ActionEvent event) -> {
            tfTela.setText(tfTela.getText() + "5");
        });

        btnSeis.setOnAction((ActionEvent event) -> {
            tfTela.setText(tfTela.getText() + "6");
        });

        btnSete.setOnAction((ActionEvent event) -> {
            tfTela.setText(tfTela.getText() + "7");
        });

        btnOito.setOnAction((ActionEvent event) -> {
            tfTela.setText(tfTela.getText() + "8");
        });

        btnNove.setOnAction((ActionEvent event) -> {
            tfTela.setText(tfTela.getText() + "9");
        });

        btnZero.setOnAction((ActionEvent event) -> {
            tfTela.setText(tfTela.getText() + "0");
        });

        btnAdi.setOnAction((ActionEvent event) -> {
            valor1 = Double.parseDouble(tfTela.getText());
            tfTela.setText("");
            operacao = "+";
        });

        btnSub.setOnAction((ActionEvent event) -> {
            valor1 = Double.parseDouble(tfTela.getText());
            tfTela.setText("");
            operacao = "-";
        });

        btnMult.setOnAction((ActionEvent event) -> {
            valor1 = Double.parseDouble(tfTela.getText());
            tfTela.setText("");
            operacao = "*";
        });

        btnDiv.setOnAction((ActionEvent event) -> {
            valor1 = Double.parseDouble(tfTela.getText());
            tfTela.setText("");
            operacao = "/";
        });

        btnApagar.setOnAction((ActionEvent event) -> {
            tfTela.setText("");
            valor1 = 0;
            valor2 = 0;
            operacao = "";
        });

        btnIgual.setOnAction((ActionEvent event) -> {
            valor2 = Double.parseDouble(tfTela.getText());

            switch (operacao) {
                case "+":
                    resultado = valor1 + valor2;

                    tfTela.setText(String.valueOf(resultado));
                    break;
                case "-":
                    resultado = valor1 - valor2;

                    tfTela.setText(String.valueOf(resultado));
                    break;
                case "*":
                    resultado = valor1 * valor2;

                    tfTela.setText(String.valueOf(resultado));
                    break;
                case "/":
                    if (valor2 <= 0) {
                        tfTela.setText("");
                        valor1 = 0;
                        valor2 = 0;
                        operacao = "";

                    } else {
                        resultado = valor1 / valor2;
                        tfTela.setText(String.valueOf(resultado));
                    }
                    break;
            }
        });

        btnPonto.setOnAction((ActionEvent event) -> {
            tfTela.setText(tfTela.getText() + ".");
        });
    }
}