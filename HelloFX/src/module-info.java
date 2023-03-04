module hellofx {
    requires transitive javafx.controls;
    exports MakeBasicWindow;
    exports interacting;
    exports CloseApplications;
    exports CheckJavaVersion;
    exports PopUpWindows;
    exports SwitchingScenes;

    // The name on the exports line must match the package name you created.
    // It is also case-sensitive.
}