package com.OneToMany.Repository;

import org.springframework.data.repository.CrudRepository;

import com.OneToMany.request.Tutorials;

public interface TutorialsRepository extends CrudRepository<Tutorials,Integer> {

}
