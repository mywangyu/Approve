package xdd.service.interfaces;

import com.xdd.data.entity.User;

/**
 * Created by Deso on 2019/3/18.
 */
public interface IUserQueryService {

    User getUserByUid(Long uid);

}
