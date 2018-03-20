package baseinfo.service;

import baseinfo.dto.iRoleDTO;

public interface iRoleService {
	
	public int insertRole(iRoleDTO role);
	
	public int deleteRole(Long id);
	
	public int updateRole(iRoleDTO role);
	
	public iRoleDTO getRole(Long id);
}
