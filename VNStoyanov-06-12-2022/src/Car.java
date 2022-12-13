class Car extends Vehicle {
    public String name;
    public Car() {
        name = "";
    }
    public void setDetails(String name) {
        this.name = name;
    }
    public String getDetails(String carName) {
        String details = "";
        details += carName + ", " + super.getModel() + ", " + super.getSpeed();
        return details;
    }
} 