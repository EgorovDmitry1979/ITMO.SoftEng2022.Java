package Lab2.Ex2;

// КПУ - конструктор по умолчанию
// КБП - конструктор без параметров
// КСП - конструктор с параметарами

public class Main {
    public static void main(String[] arg) {
//      CabinetFurniture cabinetFurniture = new CabinetFurniture(); // ожидает КПУ или КБП

        CabinetFurniture cabinetFurniture = new CabinetFurniture("Room", Material.LDSP); // ожидает КСП
        System.out.println(cabinetFurniture);

        System.out.println(cabinetFurniture.getMaterial()); // геттер, возвращающий материал

        cabinetFurniture.setAppointment("Kitchen"); // сеттер, добавляющий назначение объекта

        // Можно задавать и получать значения полей через геттеры и сеттеры.
    }
}
