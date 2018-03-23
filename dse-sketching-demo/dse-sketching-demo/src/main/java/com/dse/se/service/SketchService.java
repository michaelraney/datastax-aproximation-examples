package com.dse.se.service;

import com.dse.se.dao.ISketchDAO;
import com.dse.se.dto.TopHashTagsDTO;
import com.dse.se.dto.UniqueUsersDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Date;

/**
 * Created by michaelraney on 3/18/18.
 */
@Component
public class SketchService {

    @Autowired
    ISketchDAO sketchDAO;


    public UniqueUsersDTO getUniqueUsersForToday() throws ParseException {

        return sketchDAO.getUniqueUsersForToday(new Date());

    }

    public UniqueUsersDTO getUniqueUsersRollup() throws ParseException {
        return sketchDAO.getUniqueUsersRollup(new Date());
    }

    public TopHashTagsDTO getTopTweetsRollup() throws ParseException {
        return sketchDAO.getTopTweetsRollup(new Date());

    }
}