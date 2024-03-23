import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;
import ru.netology.java9.Radio;

public class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "10,0",
            "9,9",
            "8,8",
            "-1,9",
            "0,0",
            "1,1",
    })
    public void testSetRadioStation(int setStation, int expected) {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(setStation);
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "9,0",
            "8,9",
    })
    public void testNextRadioStation(int setStation, int expected) {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(setStation);
        radio.nextRadioStation();
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,9",
            "1,0",
    })
    public void testPrevRadioStation(int setStation, int expected) {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(setStation);
        radio.prevRadioStation();
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "101,100",
            "100,100",
            "99,99",
            "1,1",
            "0,0",
            "-1,0",
    })
    public void testSetVolume(int setVolume, int expected) {
        Radio radio = new Radio();

        radio.setCurrentVolume(setVolume);
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "100,100",
            "99,100",
    })
    public void testIncreaseVolume(int setVolume, int expected) {
        Radio radio = new Radio();

        radio.setCurrentVolume(setVolume);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1,0",
            "0,0",
    })
    public void testReduceVolume(int setVolume, int expected) {
        Radio radio = new Radio();

        radio.setCurrentVolume(setVolume);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountRadioStation() {
        Radio radio = new Radio(15);

        Assertions.assertEquals(15, radio.getCountRadioStation());
    }

    @Test
    public void testRadioStation() {
        Radio radio = new Radio(15, 10, 10);

        Assertions.assertEquals(15, radio.getCountRadioStation());
        Assertions.assertEquals(10, radio.getCurrentRadioStation());
        Assertions.assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void testSetCountRadioStation() {
        Radio radio = new Radio();
        radio.setCountRadioStation(15);
        Assertions.assertEquals(15, radio.getCountRadioStation());
    }
}