package com.rest.SpringBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SecurityStudentsDetailsService implements UserDetailsService {
    @Autowired
    private StudentRepository studentsRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Student student = studentsRepository.findStudentByUserName(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not present"));
        return student;
    }
    public void createStudent(UserDetails student){
        studentsRepository.save((Student) student);
    }
}
