import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import ru.netology.Radio.Radio;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio station = new Radio();

        station.currentStation = 5;

        int expected = 5;
        int actual = station.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLowBoundaryValuesSetCurrentStationMinusOne() {

        Radio numberStation = new Radio();

        numberStation.setCurrentStation(-1);

        int expected = 0;
        int actual = numberStation.currentStation;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testLowBoundaryValuesSetCurrentStationEquals() {

        Radio numberStation = new Radio();

        numberStation.setCurrentStation(0);

        int expected = 0;
        int actual = numberStation.currentStation;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testLowBoundaryValuesSetCurrentStationPlusOne() {

        Radio numberStation = new Radio();

        numberStation.setCurrentStation(1);

        int expected = 1;
        int actual = numberStation.currentStation;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testHighBoundaryValuesSetCurrentStationMinusOne() {

        Radio numberStation = new Radio();

        numberStation.setCurrentStation(8);

        int expected = 8;
        int actual = numberStation.currentStation;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testHighBoundaryValuesSetCurrentStationEquals() {

        Radio numberStation = new Radio();

        numberStation.setCurrentStation(9);

        int expected = 9;
        int actual = numberStation.currentStation;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testHighBoundaryValuesSetCurrentStationPlusOne() {

        Radio numberStation = new Radio();

        numberStation.setCurrentStation(10);

        int expected = 0;
        int actual = numberStation.currentStation;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testNextMethodAboveMax () {

        Radio numberStation = new Radio();
        numberStation.setCurrentStation(9);

        numberStation.next();

        int expected = 0;
        int actual = numberStation.currentStation;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNextMethodBelowMax () {

        Radio numberStation = new Radio();
        numberStation.setCurrentStation(4);

        numberStation.next();

        int expected = 5;
        int actual = numberStation.currentStation;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testPrevMethodBelowMin () {

        Radio numberStation = new Radio();
        numberStation.setCurrentStation(0);

        numberStation.prev();

        int expected = 9;
        int actual = numberStation.currentStation;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testPrevMethodBelowMax () {

        Radio numberStation = new Radio();
        numberStation.setCurrentStation(4);

        numberStation.prev();

        int expected = 3;
        int actual = numberStation.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeBelowMax () {

        Radio volumeValue = new Radio();
        volumeValue.setCurrentVolume(4);

        volumeValue.increaseVolume();

        int expected = 5;
        int actual = volumeValue.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testIncreaseVolumeEqualsMax () {

        Radio volumeValue = new Radio();
        volumeValue.setCurrentVolume(10);

        volumeValue.increaseVolume();

        int expected = 10;
        int actual = volumeValue.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testReduceVolumeAboveMin () {

        Radio volumeValue = new Radio();
        volumeValue.setCurrentVolume(4);

        volumeValue.reduceVolume();

        int expected = 3;
        int actual = volumeValue.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testReduceVolumeEqualsMin () {

        Radio volumeValue = new Radio();
        volumeValue.setCurrentVolume(0);

        volumeValue.reduceVolume();

        int expected = 0;
        int actual = volumeValue.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}
