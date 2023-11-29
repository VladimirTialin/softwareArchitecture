package ru.geekbrains.lesson1.homework.ModelElements;

import lombok.*;

/**
 * Камера
 * TODO: Доработать самостоятельно в рамках домашней работы
 */
@Getter
@Setter
@AllArgsConstructor
public class Camera {
    private Point3D location;
    private  Angle3D angle3D;

    public void rotate(Angle3D angle3D){
        this.angle3D=angle3D;

    }
    public void move(Point3D point3D){
        this.location=point3D;
    }
}
