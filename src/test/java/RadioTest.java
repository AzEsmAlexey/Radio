import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import ru.netology.Radio.Radio;

public class RadioTest {

    @Test
    public void testSetCurrentVolumeBelowMin() {
        Radio vol = new Radio();

        vol.setCurrentVolume(-1);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolumeAboveMax() {
        Radio vol = new Radio();

        vol.setCurrentVolume(101);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        Radio station = new Radio();

        station.setCurrentStation(5);

        int expected = 5;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testLowBoundaryValuesSetCurrentStationMinusOne() {

        Radio numberStation = new Radio();

        numberStation.setCurrentStation(-1);

        int expected = 0;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testLowBoundaryValuesSetCurrentStationEquals() {

        Radio numberStation = new Radio();

        numberStation.setCurrentStation(0);

        int expected = 0;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testLowBoundaryValuesSetCurrentStationPlusOne() {

        Radio numberStation = new Radio();

        numberStation.setCurrentStation(1);

        int expected = 1;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testHighBoundaryValuesSetCurrentStationMinusOne() {

        Radio numberStation = new Radio();

        numberStation.setCurrentStation(8);

        int expected = 8;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testHighBoundaryValuesSetCurrentStationEquals() {

        Radio numberStation = new Radio();

        numberStation.setCurrentStation(9);

        int expected = 9;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testHighBoundaryValuesSetCurrentStationPlusOne() {

        Radio numberStation = new Radio();

        numberStation.setCurrentStation(10);

        int expected = 0;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testNextMethodAboveMax() {

        Radio numberStation = new Radio();
        numberStation.setCurrentStation(9);

        numberStation.next();

        int expected = 0;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextMethodBelowMax() {

        Radio numberStation = new Radio();
        numberStation.setCurrentStation(8);

        numberStation.next();

        int expected = 9;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevMethodBelowMin() {

        Radio numberStation = new Radio();
        numberStation.setCurrentStation(0);

        numberStation.prev();

        int expected = 9;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevMethodBelowMax() {

        Radio numberStation = new Radio();
        numberStation.setCurrentStation(4);

        numberStation.prev();

        int expected = 3;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeBelowMax() {

        Radio volumeValue = new Radio();
        volumeValue.setCurrentVolume(4);

        volumeValue.increaseVolume();

        int expected = 5;
        int actual = volumeValue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeEqualsMax() {

        Radio volumeValue = new Radio();
        volumeValue.setCurrentVolume(100);

        volumeValue.increaseVolume();

        int expected = 100;
        int actual = volumeValue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReduceVolumeAboveMin() {

        Radio volumeValue = new Radio();
        volumeValue.setCurrentVolume(4);

        volumeValue.reduceVolume();

        int expected = 3;
        int actual = volumeValue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReduceVolumeEqualsMin() {

        Radio volumeValue = new Radio();
        volumeValue.setCurrentVolume(0);

        volumeValue.reduceVolume();

        int expected = 0;
        int actual = volumeValue.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationConst2() {
        Radio station = new Radio(22);

        station.setCurrentStation(14);

        int expected = 14;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testLowBoundaryValuesSetCurrentStationMinusOneConst2() {

        Radio numberStation = new Radio(22);

        numberStation.setCurrentStation(-1);

        int expected = 0;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testLowBoundaryValuesSetCurrentStationEqualsConst2() {

        Radio numberStation = new Radio(22);

        numberStation.setCurrentStation(0);

        int expected = 0;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testLowBoundaryValuesSetCurrentStationPlusOneConst2() {

        Radio numberStation = new Radio(22);

        numberStation.setCurrentStation(1);

        int expected = 1;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testHighBoundaryValuesSetCurrentStationMinusOneConst2() {

        Radio numberStation = new Radio(22);

        numberStation.setCurrentStation(20);

        int expected = 20;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testHighBoundaryValuesSetCurrentStationEqualsConst2() {

        Radio numberStation = new Radio(22);

        numberStation.setCurrentStation(21);

        int expected = 21;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testHighBoundaryValuesSetCurrentStationPlusOneConst2() {

        Radio numberStation = new Radio(22);

        numberStation.setCurrentStation(22);

        int expected = 0;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testNextMethodAboveMaxConst2() {

        Radio numberStation = new Radio(22);
        numberStation.setCurrentStation(21);

        numberStation.next();

        int expected = 0;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextMethodBelowMaxConst2() {

        Radio numberStation = new Radio(22);
        numberStation.setCurrentStation(21);

        numberStation.next();

        int expected = 0;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevMethodBelowMinConst2() {

        Radio numberStation = new Radio(22);
        numberStation.setCurrentStation(0);

        numberStation.prev();

        int expected = 21;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevMethodBelowMaxConst2() {

        Radio numberStation = new Radio(22);
        numberStation.setCurrentStation(5);

        numberStation.prev();

        int expected = 4;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}
