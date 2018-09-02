package com.bvan.javaoop.lessons3_4.menu;

/**
 * @author bvanchuhov
 */
public class MenuRunner {

    public static void main(String[] args) {
        Menu dessertMenu = createDessertMenu();

        System.out.println(dessertMenu.getCheapestDish());
    }

    private static Menu createDessertMenu() {
        Menu menuOne = new Menu("Dessert");
        menuOne.add(new Dish("cheesecake", "dessert with cheese", 86));
        menuOne.add(new Dish("tiramisu", "refined Italian dessert", 78));
        menuOne.add(new Dish("napoleon", "cake with custard and cream", 69));
        return menuOne;
    }
}
