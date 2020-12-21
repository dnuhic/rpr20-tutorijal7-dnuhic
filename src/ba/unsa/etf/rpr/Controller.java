package ba.unsa.etf.rpr;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Controller {

    public void buttonClickKraj(ActionEvent actionEvent) {
        Window window = ((Node)actionEvent.getSource()).getScene().getWindow();
        ((Stage) window).close();
    }
}
