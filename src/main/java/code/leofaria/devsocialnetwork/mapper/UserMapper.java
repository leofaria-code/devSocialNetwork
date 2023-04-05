package code.leofaria.devsocialnetwork.mapper;
import code.leofaria.devsocialnetwork.domain.User;
import code.leofaria.devsocialnetwork.dto.UserSaveDTO;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    User userSaveDTOtoUser(UserSaveDTO dto);
}
