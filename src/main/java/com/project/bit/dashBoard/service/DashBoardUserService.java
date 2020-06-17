package com.project.bit.dashBoard.service;

import com.project.bit.dashBoard.domain.IssueTypeCountVO;
import com.project.bit.dashBoard.domain.TaskStatusCountVO;
import com.project.bit.dashBoard.domain.UserCountVO;

import java.util.*;

public interface DashBoardUserService {
    public UserCountVO getDashBoardUserCount(String userId);

    public List<TaskStatusCountVO> getTaskStatusCountUser(String userId);

//    public List<OutputVO> getMyOutputList(String userId);

    public List<IssueTypeCountVO> getIssueStatusCountUser(String userId);

//    public List<MyTaskVO> getMyTaskList(String userId);

}
