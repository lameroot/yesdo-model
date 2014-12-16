package ru.yesdo.model;

import java.util.Set;

/**
 * Created by lameroot on 13.12.14.
 * Пользователь системы. Это может быть как пользователь системы для мерчантов, так и пользователь который заходит на сайт.
 * Реализация как имплементация UserDetails of SpringSecurity
 * Также предусмотреть возможность авторизации через соц. сети (!!!на данном этапе делать не надо)
 * В оконсоли должна быть отдельная вкладка для управления пользователями, можно всё также как это сделано у нас в консоли
 */
public class User {

    private Long id;
    private Set<Option> options;//опции которыми обладает пользваотель
    private Merchant merchant;//если это пользователь мерчанта, то это он
    //whole params as UserDetails from Spring Security
    private String username;
    private String password;
    //etc
}
