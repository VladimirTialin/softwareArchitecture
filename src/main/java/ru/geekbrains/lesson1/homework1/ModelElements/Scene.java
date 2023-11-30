package ru.geekbrains.lesson1.homework1.ModelElements;

import lombok.*;

/**
 * Сцена
 * TODO: Доработать самостоятельно в рамках домашней работы
 */
@Getter
@Setter
@AllArgsConstructor
public class Scene {
    private int id;
    PoligonalModel poligonalModel;
    Flash flash;
}
