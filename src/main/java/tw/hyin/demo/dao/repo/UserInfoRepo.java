package tw.hyin.demo.dao.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tw.hyin.demo.entity.UserInfo;

/**
 * @author H-yin on 2022
 * 
 * @RepositoryRestResource 可以直接使用
 * POST /userInfoes
 * PUT /userInfoes/{id}
 * GET /userInfoes/{id}
 * DELETE /userInfoes/{id}
 * 不用重複寫這些 CRUD
 */
@RepositoryRestResource
public interface UserInfoRepo extends CrudRepository<UserInfo, String> {

}
