module it.unisa.diem.se.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens it.unisa.diem.se.demo to javafx.fxml;
    exports it.unisa.diem.se.demo;
}