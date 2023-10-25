package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.ClassBasedNavigableIterableAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUp(){
//        Подготовка
        car = new Car("Porshe", "911", 9);
        motorcycle = new Motorcycle("Yamaha", "XVS950", 5);
    }
    @Test
    public void testCarInstasOfVehicle() {
//        Проверка утверждения
        assertTrue(car instanceof Vehicle);
    }
    @Test
    public void testCarFourWheels(){
//        Проверка утверждения
        assertThat(car.getNumWheels()).isEqualTo(4);
//        assertEquals(car.getNumWheels(), 4);
    }
    @Test
    public void testMotorcycle(){
//        Проверка утверждения
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test
    public  void testCarTestDrive(){
//           Выполнение
        car.testDrive();
//        Проверка утверждения
        assertEquals(car.getSpeed(), 60);
    }
    @Test
    public void testMotorcycleTestDrive(){
//        Выполнение
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }
    @Test
    public void testParkCarStopSpeed(){
//        Выполнение
        car.testDrive();
        car.park();
//        Проверка утверждения
        assertEquals(car.getSpeed(), 0);
    }
    @Test
    public void testParkMotorcycleStopSpeed(){
//        Выполнение
        motorcycle.testDrive();
        motorcycle.park();
//        Проверка утверждения
        assertEquals(motorcycle.getSpeed(), 0);
    }
}