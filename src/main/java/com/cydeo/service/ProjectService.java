package com.cydeo.service;

import com.cydeo.dto.ProjectDTO;

                                                            //String - unique object - Project Code
public interface ProjectService extends CrudService<ProjectDTO,String>{

    void complete(ProjectDTO project);


}
