package baseinfo.web;

import org.springframework.stereotype.Controller;

import baseinfo.dao.iRoleDAO;
import baseinfo.dto.iRoleDTO;

@Controller
public class iRoleController {
	
	private static void testRoleMapper() {
//		Logger log = Logger.getLogger(iRoleController.class);
		SqlSession sqlSession = null;
		try {
			sqlSession = SqlSessionFactoryUtils.openSqlSession();
			iRoleDAO roleMapper = sqlSession.getMapper(iRoleDAO.class);
			iRoleDTO role = roleMapper.getRole(1L);
//			log.info(role.getRoleName());
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}
}
