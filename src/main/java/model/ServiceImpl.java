package model;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.VptEmployee;
import in.vpt.module.UserService;
import repository.UserRepository;

@Service
public class ServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public void saveUserData(VptEmployee vptEmployee) {
		userRepo.save(vptEmployee);
	}

	@Override
	public List<VptEmployee> getUserData() {
		List<VptEmployee> u=userRepo.findAll();
		return u;
	}

	@Override
	public void deleteUserData(long id) {
		userRepo.deleteById(id);
	}

	@Override
	public void updateUserData(Long id, VptEmployee vptEmployee) {
		VptEmployee userData = userRepo.findById(id).orElseThrow(()->new EntityNotFoundException());
		userData.setUserName(vptEmployee.getUserName());
		userData.setUserEmail(vptEmployee.getUserEmail());
		userData.setUserMobile(vptEmployee.getUserMobile());
		userData.setUserPosition(vptEmployee.getUserPosition());
		userRepo.save(userData);
		
	}


}
