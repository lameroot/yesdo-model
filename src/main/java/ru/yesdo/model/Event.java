package ru.yesdo.model;

import java.util.Date;

/**
 * Created by lameroot on 13.12.14.
 * Event - событие, которое может создавать администратор портала
 * То есть это к примеру концерт как-то
 * !!!На данном этапе сделать просто как заглушечную модель, чтобы можно было создавать и всё
 */
public class Event {

    private Long id;
    private String title;//название
    private String description;//описание
    private EventTime time;//время когда будет происходить данное мероприятие
    private Location location;//гео-данные где оно будет происходить
    private EventType type;//тип события
    private EventPrice price;//цена на событие


}
