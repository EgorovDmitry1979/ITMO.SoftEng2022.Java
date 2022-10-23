package Lab2.Ex2;

// Создать класс, который обозначает какую-либо сущность.
// Определить у него несколько конструкторов - конструктор по умолчанию
// и конструктор со всеми параметрами. Определить для него несколько параметров.

public class CabinetFurniture // класс Корпусная мебель
{
    // поля, по которым создается мебель

    private String appointment; // назначение мебели (для комнаты, кухни, ванны и т.д.)
    private Material material; // перечисления материалов (создаем дополнительный класс)
    private Long price; // цена
    private Boolean isInStock; // в наличии


    // методы для установки/получения значения

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Boolean getInStock() {
        return isInStock;
    }

    public void setInStock(Boolean inStock) {
        isInStock = inStock;
    }

    // конструктор без параметров
    //    public CabinetFurniture ()
    {
    }
    // конструктор с параметрами
    public CabinetFurniture (String appointment, Material material)
    {
        this.appointment = appointment; // инициализация парамертов в конструкторе
        this.material = material; // инициализация парамертов в конструкторе
    }

    // переопределение метода toString()
    @Override
    public String toString() {
        return "CabinetFurniture{" +
                ", appointment='" + appointment + '\'' +
                ", material=" + material +
                ", price=" + price +
                ", isInStock=" + isInStock +
                '}';
    }
}
