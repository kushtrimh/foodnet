/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodnet.foodnetserver.DAL;

import foodnet.foodnetserver.BLL.Useri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Kushtrim Hajrizi
 */
@Repository
public interface UseriRepository extends JpaRepository<Useri, Integer> {
    
    @Query("SELECT u FROM Useri u WHERE u.loginEntityId.loginId = :loginId")
    Useri findByLoginId(@Param("loginId") int loginId);
}
