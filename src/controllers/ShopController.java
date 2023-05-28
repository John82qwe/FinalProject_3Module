package controllers;

import data.service.ShopService;
import view.AppView;

import java.util.Scanner;

public class ShopController {
    final AppView appView;
    public final ShopService shopService;

    public ShopController(AppView appView, ShopService shopService) {
        this.appView = appView;
        this.shopService = shopService;
    }

    public void run(){         // запуск программы
        while (true){
            appView.action();          // показать окошко
            if (appView.children.size() == 0) break;        // если детей нет, то break
            appView.displayChildren();              // показать всех детей
            Scanner sc = new Scanner(System.in);
            int value = sc.nextInt();        // считываем то что хочет ввести пользователь(число)
            if (value < 0 && value > appView.children.size()+1){     // проверка на корректность ввода
                System.out.println("Wrong value!");
            }
            else if (value == appView.children.size() + 1) {       // если пользователь ввел кнопку назад, то break
                break;
            }
            else {
                new ShopController(appView.children.get(value - 1), shopService).run();    // создаем новый шопконтроллер, который будет работать на уровень ниже, чем первый. Он отображает окна детей


            }
        }
    }
}
