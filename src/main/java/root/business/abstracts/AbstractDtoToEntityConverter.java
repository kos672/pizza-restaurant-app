package root.business.abstracts;


import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Abstract type for all DataTransferObject to Entity converters
 *
 * @param <D> data transfer object
 * @param <E> entity
 */
public abstract class AbstractDtoToEntityConverter<D, E> {
    /**
     * Method converts single DTO to Entity
     *
     * @param dto input
     * @return entity
     */
    public abstract E convert(D dto);

    /**
     * Method converts collections of dto's
     *
     * @param dtos input
     * @return entities
     */
    public List<E> convertAll(List<D> dtos) {
        return dtos.stream().map(this::convert).collect(toList());
    }
}
