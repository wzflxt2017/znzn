package observerPattern;

/**
 * Created by wangzefeng on 2019/7/9 0009.
 */
public class ObserverDemo {
    /**
     * 测试观察者模式
     * @param args
     */
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentDisplay currentDisplay=new CurrentDisplay(weatherData);//向“主题”中注册自己
        weatherData.setMeasurements("25","67","1000");
        weatherData.setMeasurements("29","74","1000");
    }
}
