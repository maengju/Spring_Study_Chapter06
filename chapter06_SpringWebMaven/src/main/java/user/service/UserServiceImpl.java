package user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import user.bean.UserDTO;
import user.dao.UserDAO;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public String checkId(String id) {
		UserDTO userDTO = userDAO.checkId(id);
		
		if(userDTO == null) {
			return "non_exist"; //사용가능
		}else {
			return "exist"; //사용불가
		}
	}


	@Override
	public void write(UserDTO userDTO) {
		
		userDAO.write(userDTO);
		
	}


	@Override
	public List<UserDTO> getUserList() {
		
		return userDAO.getUserList();
		
		
	}


	@Override
	public UserDTO getUser(String searchId) {
		
		return userDAO.getUser(searchId);
	}


	@Override
	public void modify(UserDTO userDTO) {
		userDAO.modify(userDTO);
	}


	@Override
	public void delete(String searchId) {
		userDAO.delete(searchId);
		
	}
	
	

}
