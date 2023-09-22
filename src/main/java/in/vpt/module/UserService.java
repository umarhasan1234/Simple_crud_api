package in.vpt.module;

import java.util.List;

import entity.VptEmployee;

public interface UserService {

public void saveUserData(VptEmployee vptEmployee);
	
	public List<VptEmployee> getUserData();
	
	public void deleteUserData(long id);
	
	public void updateUserData(Long id, VptEmployee vptEmployee);


}
