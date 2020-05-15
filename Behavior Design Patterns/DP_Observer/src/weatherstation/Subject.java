/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package weatherstation;

/**
 * @author KI
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
