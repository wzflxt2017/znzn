package observerPattern;

/**
 * Created by wangzefeng on 2019/7/9 0009.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
