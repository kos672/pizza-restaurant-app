package root.business.abstracts;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Abstract type for all Entity to DataTransferObject converters
 *
 * @param <E> input entity
 * @param <D> output DTO
 */
public abstract class AbstractEntityToDtoConverter<E, D> {

    /**
     * Method converts single entity to DTO
     *
     * @param entity input
     * @return data transfer object
     */
    public abstract D convert(E entity);

    /**
     * Method converts collection of entities
     *
     * @param entities input
     * @return dtos
     */
    public List<D> convertAll(List<E> entities) {
        return entities.stream().map(this::convert).collect(Collectors.toList());
    }

}
