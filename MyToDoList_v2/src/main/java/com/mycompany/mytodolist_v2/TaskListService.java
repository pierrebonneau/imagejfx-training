/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mytodolist_v2;

import java.util.List;
import org.scijava.service.SciJavaService;

/**
 *
 * @author pierre
 */
public interface TaskListService extends SciJavaService{
    public List<Task> getTasks();
    public void addTask(String name);
    public void addTask(Task task);
    public void deleteTask(Task task);
//    public void addTaskListeners(Consumer<TaskEvent> listener);
}
