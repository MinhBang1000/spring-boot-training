package ctu.cit.se.student.training.utilities.mappers.interfaces;

public interface IModelMapper<S,R> {
    R mappingTo(S source);
    S inverseTo(R result);
}
