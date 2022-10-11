package com.cydeo.service;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.dto.UserDTO;

import java.util.List;

//String - unique object - Project Code
public interface ProjectService extends CrudService<ProjectDTO,String>{

    void complete(ProjectDTO project);
    List<ProjectDTO> getCountedListOfProjectDTO(UserDTO manager);


}
