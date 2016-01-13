package com.svj.db.service;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;

public interface ToDo
{
    


    String TODO                      = "SELECT todolist.id, todolist.item FROM todolist";
    String TODO_BY_ID                      = "SELECT todolist.id, todolist.item FROM todolist where todolist.id=:id";

    @SqlQuery(TODO)
    List<String> getToDos(@Bind("id") String userGroupUuid);
    
    @SqlQuery(TODO_BY_ID)
    List<String> getToDoById(@Bind("id") String userGroupUuid);

  
}
