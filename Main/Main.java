package Main;

import Controller.Controller;
import View.MainMenu;

public class Main {

    public static void main(String[] args) {
        
        Controller controller = new Controller();

        MainMenu menu = new MainMenu(controller); 

    }

}
