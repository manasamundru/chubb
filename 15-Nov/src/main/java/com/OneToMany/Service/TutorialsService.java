package com.OneToMany.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OneToMany.Repository.TutorialsRepository;
import com.OneToMany.request.Tutorials;

@Service
public class TutorialsService {
   @Autowired
   TutorialsRepository tutorialsRepo;
   public Tutorials insertTutorial(Tutorials tutorial) {
	   tutorialsRepo.save(tutorial);
	   return tutorial;
   }
}
