package baseinfo.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import baseinfo.dto.iRoleDTO;

public class BaseServices {
	
	protected Log logger = LogFactory.getLog(this.getClass());
	
	protected final void _throwEx(String msg) throws Exception{
		throw new Exception(msg);
	}

	public int insertRole(iRoleDTO role) {
		// TODO Auto-generated method stub
		return 0;
	}

	public iRoleDTO getRole(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
