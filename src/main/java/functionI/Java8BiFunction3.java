package functionI;

import java.util.function.BiFunction;

/**
 * @author yang.jiaqi@vpclub.cn
 * @date 2021/6/27 18:34
 */
public class Java8BiFunction3 {

    public static void main(String[] args) {
        GPS factory = factory("40.23423", "-73.98223", GPS::new);
        System.out.println(factory.toString());
    }

    public static <R extends GPS> R factory(String latitude, String longitude,
                                            BiFunction<String, String,R> func) {
        return func.apply(latitude, longitude);
    }
}

class GPS {
    String latitude;
    String longitude;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public GPS(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "GPS{" +
                "latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }
}