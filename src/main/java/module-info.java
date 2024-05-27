module org.example.university_secondsemester_workshop_pinterestfront {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.university_secondsemester_workshop_pinterestfront to javafx.fxml;
    exports org.example.university_secondsemester_workshop_pinterestfront;
}