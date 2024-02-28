package com.CISProject.LibraryService.Repository;

import com.CISProject.LibraryService.entity.LibraryMember;
import com.CISProject.LibraryService.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LibraryMemberRepository extends JpaRepository<LibraryMember, Integer> {

}