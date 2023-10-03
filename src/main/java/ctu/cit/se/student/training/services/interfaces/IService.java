package ctu.cit.se.student.training.services.interfaces;

import java.util.List;

public interface IService<T,ID> {
    T create(T source);
    T update(T source);
    List<T> list();
    T retrieve(ID id);
}
