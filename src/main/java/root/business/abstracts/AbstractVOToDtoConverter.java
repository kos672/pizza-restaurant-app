package root.business.abstracts;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Abstract type for all ValueObject to DataTransferObject converters
 *
 * @param <VO> value object
 * @param <D>  data transfer object
 */
public abstract class AbstractVOToDtoConverter<VO, D> {
    /**
     * Method converts single VO to DTO
     *
     * @param vo input
     * @return dto
     */
    public abstract D convert(VO vo);

    /**
     * Methods converts collection of value objects
     *
     * @param vos input
     * @return dto's
     */
    public List<D> convertAll(List<VO> vos) {
        return vos.stream().map(this::convert).collect(toList());
    }
}
