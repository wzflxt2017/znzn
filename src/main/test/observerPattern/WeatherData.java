package observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangzefeng on 2019/7/9 0009.
 */
public class WeatherData implements Subject{

    private List<Observer> observers;
    private String temperatrue;
    private String humidity;
    private String perssure;

    public WeatherData(){
        observers=new ArrayList<>();
    }

    //用于模拟一个气象站
    public void setMeasurements(String temperatrue,String humidity,String perssure){
        this.temperatrue=temperatrue;
        this.humidity=humidity;
        this.perssure=perssure;
        measurementsChanged();
    }

    //当气象站的硬件获取到新的气象数据后调用此方法
    public void measurementsChanged(){
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(temperatrue,humidity,perssure);
        }
    }

    public String getTemperatrue() {
        return temperatrue;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getPerssure() {
        return perssure;
    }
}
