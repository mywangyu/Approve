package xdd.service.impls;

import com.xdd.data.entity.User;
import org.springframework.stereotype.Service;
import xdd.service.interfaces.IUserQueryService;

/**
 * Created by Deso on 2019/3/18.
 */
@Service
public class UserQueryService implements IUserQueryService {
    @Override
    public User getUserByUid(Long uid) {
        return null;
    }
}
