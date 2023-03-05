package dad.controller;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Year;
import java.util.ResourceBundle;

import dad.componentes.MonthComponent;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.util.converter.NumberStringConverter;

public class RootController implements Initializable {
	
	// model
	
		private IntegerProperty yearProperty = new SimpleIntegerProperty();
		
		// view
		
		@FXML
		private Label yearLabel;

	    @FXML
	    private MonthComponent enero;
	    @FXML
	    private MonthComponent febrero;
	    @FXML
	    private MonthComponent marzo;
	    @FXML
	    private MonthComponent abril;
	    @FXML
	    private MonthComponent mayo;
	    @FXML
	    private MonthComponent junio;
	    @FXML
	    private MonthComponent julio;
	    @FXML
	    private MonthComponent agosto;
	    @FXML
	    private MonthComponent septiembre;
	    @FXML
	    private MonthComponent octubre;
	    @FXML
	    private MonthComponent noviembre;
	    @FXML
	    private MonthComponent diciembre;

	    @FXML
	    private GridPane view;
		
		public RootController() {
			try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Calendario.fxml"));
				loader.setController(this);
				loader.load();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		
		@Override
		public void initialize(URL location, ResourceBundle resources) {
			
			// bindings
			
			yearLabel.textProperty().bind(yearProperty.asString());
			
			enero.yearPropertyProperty().bind(yearProperty);
			febrero.yearPropertyProperty().bind(yearProperty);
			marzo.yearPropertyProperty().bind(yearProperty);
			abril.yearPropertyProperty().bind(yearProperty);
			mayo.yearPropertyProperty().bind(yearProperty);
			junio.yearPropertyProperty().bind(yearProperty);
			julio.yearPropertyProperty().bind(yearProperty);
			agosto.yearPropertyProperty().bind(yearProperty);
			septiembre.yearPropertyProperty().bind(yearProperty);
			octubre.yearPropertyProperty().bind(yearProperty);
			noviembre.yearPropertyProperty().bind(yearProperty);
			diciembre.yearPropertyProperty().bind(yearProperty);
			
			// load data
			
			enero.setMonthProperty(0);
			febrero.setMonthProperty(1);
			marzo.setMonthProperty(2);
			abril.setMonthProperty(3);
			mayo.setMonthProperty(4);
			junio.setMonthProperty(5);
			julio.setMonthProperty(6);
			agosto.setMonthProperty(7);
			septiembre.setMonthProperty(8);
			octubre.setMonthProperty(9);
			noviembre.setMonthProperty(10);
			diciembre.setMonthProperty(11);
			
			yearProperty.set(Year.now().getValue());
			
		}
		
		@FXML
		void onPrevioAction(ActionEvent event) {
			yearProperty.set(yearProperty.get() - 1);
		}
		
		@FXML
		void onSiguienteAction(ActionEvent event) {
			yearProperty.set(yearProperty.get() + 1);
		}
		
		public GridPane getView() {
			return view;
		}

	}
