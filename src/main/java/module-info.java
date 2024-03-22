module payrollmanagement {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires MaterialFX;


    opens payrollmanagement to javafx.fxml;
    exports payrollmanagement;
    exports payrollmanagement.DB;
    opens payrollmanagement.DB to javafx.fxml;
}