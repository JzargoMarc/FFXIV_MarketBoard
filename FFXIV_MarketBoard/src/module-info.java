module FFXIV_MarketBoard {
	requires javafx.controls;
	requires java.net.http;
	requires org.json;
	
	opens application to javafx.graphics, javafx.fxml;
}
