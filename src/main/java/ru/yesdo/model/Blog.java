package ru.yesdo.model;

import java.util.Set;

/**
 * Created by lameroot on 13.12.14.
 * Blog - сущность для создания блога новостей как на сайте, так и в рамках новости или описания н-р какого-то события или описания компании
 */
public class Blog {

    private Long id;
    private String text;//основной текст, должен содержать некие метки, которые принадлежат ссылкам на видео, картинки итп
    private Set<Media> medias;//ссылки на медия, которые расположены в данном блоге
    private User owner;//создатель - это может быть как админ мерчанта, так и просто пользователь сайта
    private Merchant merchant;//если это блог принадлежит мерчанту, то должен быть указан, соотвественно может быть нулл
    private Set<Tag> tags;//список тэгов для данного блога, которые тут могут встречаться
}
