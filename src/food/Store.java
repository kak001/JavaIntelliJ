package food;

public abstract class Store {
    // === Atributos ===
    private String name;
    private String address;
    private int phoneNumber;

    // === Constructor ===
    public Store(String name, String address, int phoneNumber) {
        setName(name);
        setAddress(address);
        setPhoneNumber(phoneNumber);
    }

    // === Getters ===
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    // === Setters ===
    public void setName(String name) {
        if (name == null) throw new NullPointerException("El nombre no puede ser nulo.");
        if (name.isEmpty()) throw new IllegalArgumentException("El nombre no puede estar vacío.");
        this.name = name;
    }

    public void setPhoneNumber(int phoneNumber) {
        if (phoneNumber < 0) throw new IllegalArgumentException("El numero telefónico no puede ser negativo.");
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        if (address == null) throw new NullPointerException("La dirección no puede ser nula.");
        if (address.isEmpty()) throw new IllegalArgumentException("La dirección no puede estar vacía.");
        this.address = address;
    }
}
