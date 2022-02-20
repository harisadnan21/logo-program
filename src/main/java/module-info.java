open module slogo_app {
    // list all imported class packages since they are dependencies
    requires javafx.controls;
    requires javafx.base;
    requires javafx.media;
    requires javafx.web;
    requires javafx.graphics;
    requires java.desktop;
    //requires javafx.scene;

    // allow other classes to access listed packages in your project
    exports slogo;
    exports slogo.Model;
}