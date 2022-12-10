module org.bazunaka.bazfitnessfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens org.bazunaka.bazfitnessfx to javafx.fxml;
    exports org.bazunaka.bazfitnessfx;
}