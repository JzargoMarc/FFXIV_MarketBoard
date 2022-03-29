module FFXIV_MarketBoard {
	requires javafx.controls;
	requires java.net.http;
	requires com.fasterxml.jackson.databind;
	
	opens application to javafx.graphics, javafx.fxml;
}
