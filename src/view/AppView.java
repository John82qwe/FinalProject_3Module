package view;

import java.util.ArrayList;

public abstract class AppView {          // отображение программы в консоли
    public final String title;
    public final ArrayList<AppView> children;

    public AppView(String title, ArrayList<AppView> children) {
        this.title = title;
        this.children = children;
    }
    public abstract void action();        // Особый метод action, который отображает уникальную для окна информацию(Выводит окно)
    public void displayChildren(){       // отобразить детей
        System.out.println(title);
        System.out.println("Choose from 1 to " + (children.size() + 1));
        for (int i = 0; i < children.size(); i++) {
            System.out.println((i + 1) + " >>> " + children.get(i).title);
        }
        System.out.println((children.size()+1) + " >>> back");
    }



}
