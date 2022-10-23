package Lab2.Ex2;

// класс "перечисление" для материалов
public enum Material {
    DSP("ДС - плита"),
    LDSP ("ЛДС - плита"),
    MDF ("МДФ - плита"),
    VENEER ("Шпон"),
    ARRAY ("Массив");

    private final String description; // для орписание полей перечисления

    Material(String description) {
        this.description = description;
    }
}
