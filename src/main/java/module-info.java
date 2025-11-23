module local.dev.berneseclient {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.net.http;
    requires org.json;

    opens local.dev.berneseclient to javafx.fxml;
    exports local.dev.berneseclient;
}