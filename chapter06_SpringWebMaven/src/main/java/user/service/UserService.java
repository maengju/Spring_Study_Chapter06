package user.service;

import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;
import user.bean.UserDTO;

public interface UserService {

	public String checkId(String id);

	public void write(UserDTO userDTO);

	public List<UserDTO> getUserList();

	public UserDTO getUser(String searchId);

	public void modify(UserDTO userDTO);

	public void delete(String searchId);

}
