package works.lionel.model;


public class Car {

    // this class will have fields
    // they are the props of our instances

    public Long id;
    public String make;
    public String model;

    // this is our constructor
    // bear in mind this is not necessarily a method
    // there is no return type
    public Car (Long id, String make, String model) {
        this.id = id;
        this.make = make;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (id != null ? !id.equals(car.id) : car.id != null) return false;
        if (make != null ? !make.equals(car.make) : car.make != null) return false;
        return model != null ? model.equals(car.model) : car.model == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (make != null ? make.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        return result;
    }
    
}
