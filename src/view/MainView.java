package view;

import java.util.ArrayList;

public class MainView extends AppView{
    public MainView(ArrayList<AppView> children) {
        super("Shop", children);
    }

    @Override
    public void action() {         // Особый метод action, который отображает уникальную для окна информацию
        System.out.println("Welcome to our shop!");
    }
}
