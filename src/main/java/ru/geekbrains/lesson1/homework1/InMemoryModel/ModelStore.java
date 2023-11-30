package ru.geekbrains.lesson1.homework1.InMemoryModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.geekbrains.lesson1.homework1.ModelElements.Camera;
import ru.geekbrains.lesson1.homework1.ModelElements.Flash;
import ru.geekbrains.lesson1.homework1.ModelElements.PoligonalModel;
import ru.geekbrains.lesson1.homework1.ModelElements.Scene;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Хранилище 3D-элементов
 * TODO: Доработать самостоятельно в рамках домашней работы
 */
@Getter
@Setter
@AllArgsConstructor
public class ModelStore implements ModelChanger {
    private Collection<PoligonalModel> collectionModel= new ArrayList<>();
    private  Collection<Scene> collectionScene= new ArrayList<>();
    private Collection<Flash> collectionFlash= new ArrayList<>();
    private Collection<Camera> collectionCamera= new ArrayList<>();

    private Collection<ModelChangedObserver> observers = new ArrayList<>();

    public ModelStore() {

    }

    @Override
    public void registerModelChanger(ModelChangedObserver o) {
        observers.add(o);
    }

    @Override
    public void removeModelChanger(ModelChangedObserver o) {
        observers.remove(o);
    }

    /**
     * Нотификация изменений на уровне хранилища
     */
    private void notifyChange(){
        for (ModelChangedObserver observer : observers){
            observer.applyUpdateModel();
        }
    }

    public void addModel(PoligonalModel poligonalModel){
        collectionModel.add(poligonalModel);
        notifyChange();
    }
    public void addScene(Scene scene){
        collectionScene.add(scene);
        notifyChange();
    }
    public void addFlash(Flash flash){
        collectionFlash.add(flash);
        notifyChange();
    }
    public void addCamera(Camera camera){
        collectionCamera.add(camera);
        notifyChange();
    }

}
