package Compositions;

import java.awt.*;
import java.util.List;

public class University {

    // reference to refer to list of college.
    private final List colleges;
    University(List colleges)
    {
        this.colleges = colleges;
    }
    // Getting total number of colleges
    public List<College> getTotalCollegesInUniversity()
    {
        return colleges;
    }
}
