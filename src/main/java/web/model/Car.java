package web.model;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Car {
    private String colour;
    private String model;
    private int series;

    public Car() {
    }

    public Car(String colour, String model, int series) {
        this.colour = colour;
        this.model = model;
        this.series = series;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return series == car.series && Objects.equals(colour, car.colour) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, model, series);
    }
}
