package tn.isg.pfe.services.impl;

import tn.isg.pfe.model.Role;
import tn.isg.pfe.model.Utilisateur;
import tn.isg.pfe.repositories.UserRepository;
import tn.isg.pfe.services.UserService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

@Service(value = "userService")
public class UserServiceImpl implements UserService, UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Utilisateur user = userRepository.findByEmail(arg0);
		Set<Role> roles = user.getRoles();
		if (user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new User(user.getEmail(), user.getPassword(), getAuthority(user));

	}

	private Set<SimpleGrantedAuthority> getAuthority(Utilisateur user) {
		Set<SimpleGrantedAuthority> authorities = new HashSet<>();
		user.getRoles().forEach(role -> {
			// authorities.add(new SimpleGrantedAuthority(role.getName()));
			authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName()));
		});
		return authorities;
		// return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
	}

	@Override
	public Utilisateur getUserByName(String prenom) {
		return userRepository.getUserByName(prenom);
	}

	@Override
	public List<Utilisateur> findAll() {
		return (List<Utilisateur>) userRepository.findAll();
	}

}
