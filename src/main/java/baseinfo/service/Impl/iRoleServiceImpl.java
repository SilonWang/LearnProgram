package baseinfo.service.Impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import baseinfo.dao.iRoleDAO;
import baseinfo.dto.iRoleDTO;
import baseinfo.service.BaseServices;
import baseinfo.service.iRoleService;
 	
@Component
public class iRoleServiceImpl extends BaseServices implements iRoleService {
	
	@Autowired
	private iRoleDAO iroleDAO;
	
	@Override
	public int insertRole(iRoleDTO role) {
		return 0;
	}
	
	@Override
	public iRoleDTO getRole(Long id) {
		return iroleDAO.getRole(id);
	}

	public int deleteRole(Long id) {
		return 0;
	}

	public int updateRole(iRoleDTO role) {
		return 0;
	}

}
