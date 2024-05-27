package org.example.university_secondsemester_workshop_pinterestfront;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PinterestController
{
    @FXML
    private ImageView follow;

    @FXML
    private ImageView following;

    @FXML
    protected void followClick() {
        following.setVisible (true);
        follow.setVisible (false);
    }

    @FXML
    protected void followingClick() {
        following.setVisible (false);
        follow.setVisible (true);
    }
}