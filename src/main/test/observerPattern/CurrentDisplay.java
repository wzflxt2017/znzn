package observerPattern;

/**
 * Created by wangzefeng on 2019/7/9 0009.
 * 显示当前温度和湿度的布告板
 */
public class CurrentDisplay implements Observer,DisplayElement{

    private String temperatrue;
    private String humidity;
    private Subject weatherData;

    public CurrentDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("当前的温度为："+temperatrue+"摄氏度，湿度为："+humidity+"%。");
    }

    @Override
    public void update(String temperatrue, String humidity, String perssure) {
        this.temperatrue=temperatrue;
        this.humidity=humidity;
        display();
    }
}
