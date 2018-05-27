package root.business.abstracts;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Abstract type for all DataTransferObject to ValueObject converters
 *
 * @param <D>  input DTO
 * @param <VO> output VO
 */
public abstract class AbstractDtoToVOConverter<D, VO> {
    /**
     * Method converts single DTO to VO
     *
     * @param dto input
     * @return value object
     */
    public abstract VO convert(D dto);

    /**
     * Method converts collection of data transfer objects
     *
     * @param dtos input
     * @return value objects
     */
    public List<VO> convertAll(List<D> dtos) {
        return dtos.stream().map(this::convert).collect(Collectors.toList());
    }
}
