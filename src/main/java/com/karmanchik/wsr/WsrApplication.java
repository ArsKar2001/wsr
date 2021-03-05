package com.karmanchik.wsr;

import com.karmanchik.wsr.app.JavaFXApplication;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WsrApplication {

    public static void main(String[] args) {
        Application.launch(JavaFXApplication.class, args);
    }
}
